
export default {
  bootstrap: () => import('./main.server.mjs').then(m => m.default),
  inlineCriticalCss: true,
  baseHref: '/',
  locale: undefined,
  routes: [
  {
    "renderMode": 0,
    "redirectTo": "/meal-list",
    "route": "/"
  },
  {
    "renderMode": 0,
    "route": "/meal-list"
  },
  {
    "renderMode": 0,
    "route": "/meal-planner"
  },
  {
    "renderMode": 0,
    "route": "/create-meal"
  },
  {
    "renderMode": 0,
    "route": "/update-meal/*"
  },
  {
    "renderMode": 0,
    "route": "/meal-print"
  }
],
  entryPointToBrowserMapping: undefined,
  assets: {
    'index.csr.html': {size: 5251, hash: 'a0b941d3ea8c34376548982872af93bb40e2c4ad587071b24675504da596e4c8', text: () => import('./assets-chunks/index_csr_html.mjs').then(m => m.default)},
    'index.server.html': {size: 1172, hash: '0db19fb01838edc2b6b4ae3913d1f8f52c44e4a062c8814f1f8e4f277ddc4da4', text: () => import('./assets-chunks/index_server_html.mjs').then(m => m.default)},
    'styles-YY6W6OJV.css': {size: 231476, hash: 'ZrJ4+TQiBAA', text: () => import('./assets-chunks/styles-YY6W6OJV_css.mjs').then(m => m.default)}
  },
};
