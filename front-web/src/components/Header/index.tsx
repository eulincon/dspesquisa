import React from 'react';
import { ReactComponent as LogoIcon } from '../../assets/logo.svg';
import './styles.css';

const Header = () => {
    return (
        <header className="main-header">
            <LogoIcon />
            <div className="logo-text">
                <span className="logo-text-1">Big Game</span>
                <span className="logo-text-2"> Survey</span>
            </div>
        </header>
    )
}

export default Header;