import "./styles.css"
import { ReactComponent as InstagramIcon } from "./instagram.svg";
import { ReactComponent as LinkedinIcon } from "./linkedin.svg";
import { ReactComponent as GitHubIcon } from "./github.svg";

function Footer(){
    return(
       <footer className="main-footer">
                  App desenvolvido por José Henrique
                  <div className="footer-icons">
                <a href="https://www.instagram.com/jose__975/" target="_new"> 
                  <InstagramIcon />
                </a>
                <a href="https://www.linkedin.com/in/jose-henrique-24072225a/" target="_new">
                    <LinkedinIcon />
                     </a>
                <a href="https://github.com/JoseFernandes975" target="_new">
                    <GitHubIcon />
                     </a>
                  </div>
       </footer>
    )
}

export default Footer;