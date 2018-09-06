
### Development mode

To start the Figwheel compiler, navigate to the project folder and run the following command in the terminal:

```
lein figwheel
```

Figwheel will automatically push cljs changes to the browser.
Once Figwheel starts up, you should be able to open the `public/index.html` page in the browser.


### Building for production

```
lein clean
lein package
```

### Reagent Life Cycle Methods.

#### Phases of life cycle.
1. Mounting
2. Updating
3. UnMounting

Respective Reagent keys.

Mounting -> `:component-did-mount`
Render -> `:reagent-render`
Updating -> `:component-did-update`
UnMounting -> `:component-will-unmount`


Methods that are called during each phase

When Show button is clicked.
Mounting Phase
1. :reagent-render - this renders the `Counter` component to the DOM.
2. :component-did-mount - this is called after the `Counter` component is rendered/mounted on to the DOM.

When Increment button is clicked.
Update Phase
1. :reagent-render - updates the Atom and rerenderd the `Counter` component to the DOM.
2. :component-did-update - called right after the `Counter` component is rerendered on to the DOM.

When Hide button is clicked.
UnMount Phase
1. :component-will-unmount - this is called right before Reagent/React unmounts the component from the DOM.

Reference Links
1. [React Lifecycle for Re-frame](https://purelyfunctional.tv/guide/re-frame-lifecycle/)
2. [How To Use React.js Component Lifecycle Methods](http://react.tips/how-to-use-react-component-lifecycle-methods/) (outdated but a good read)
3. [React Docs](https://reactjs.org/docs/react-component.html)
