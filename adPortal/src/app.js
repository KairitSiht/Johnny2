export class App {
configureRouter(config, router) {
    this.router = router;
    config.title = 'LeaveIt2Johnny';

    config.map([
       { route: ['', 'home'],       name: 'home',       moduleId: 'home/index', title: "SIGN UP", nav: true },
      { route: 'people', name: 'people',  moduleId: 'people/people', title: "LOG IN",  nav: true },
    { route: 'users', name: 'users',  moduleId: 'users/users', title: "USERS",  nav: true }
    ]);
  }
}
