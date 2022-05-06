import { Link } from "react-router-dom";

function Navbar() {
    return (
        <div>
            <nav className="navbar navbar-expand-lg navbar-light bg-light">
                <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous" />
                <div className="container-fluid">
                    <Link to="/">
                        <div className="navbar-brand">Home</div>
                    </Link>
                    <button className="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
                        <span className="navbar-toggler-icon"></span>
                    </button>
                    <div className="collapse navbar-collapse" id="navbarNavAltMarkup">
                        <div className="navbar-nav">
                            <Link to="builds">
                                <div className="nav-link">Builds</div>
                            </Link>
                            <Link to="buildmaker">
                                <div className="nav-link">Buildmaker</div>
                            </Link>
                            <Link to="additems">
                                <div className="nav-link">Add items</div>
                            </Link>
                        </div>
                    </div>
                </div>
            </nav>
        </div>
    );
}

export default Navbar;