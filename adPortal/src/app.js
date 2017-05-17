export class App {
configureRouter(config, router) {
    this.router = router;
    config.title = 'LeaveIt2Johnny';

    config.map([
        { route: 'people', name: 'people',  moduleId: 'people/people', title: "REGISTER",  nav: true },
       { route: ['', 'home'],       name: 'home',       moduleId: 'home/index', title: "COMMENTS", nav: true },
    { route: 'users', name: 'users',  moduleId: 'users/users', title: "USERS",  nav: true }
    ]);
  }
}
