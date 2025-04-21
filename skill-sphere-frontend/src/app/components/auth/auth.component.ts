import { Component } from '@angular/core';
import { AuthService } from '../../services/auth.service';

@Component({
  selector: 'app-auth',
  templateUrl: './auth.component.html',
  styleUrls: ['./auth.component.scss']
})
export class AuthComponent {
  user = { name: '', email: '', password: '' };
  constructor(private authService: AuthService) {}
  onRegister() {
    this.authService.register(this.user).subscribe(response => {
      console.log('User registered', response);
    });
  }
}