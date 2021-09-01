import "./ProfileView.css"
import {useState} from "react";
import PortfolioItem from "./PortfolioItem";

const ProfileView = () => {

    const [portfolio, setPortfolio] = useState([
        {
            title: "developer",
            company: "experis",
            date: "2021-2022",
            description: "Lorem ipsum dolor sit amet, consectetur adipiscing elit. " +
                "Curabitur vitae luctus massa. Suspendisse potenti. " +
                "Nunc accumsan volutpat posuere. Curabitur fringilla felis non sapien" +
                " molestie, vitae sagittis tortor eleifend."
        },
        {
            title: "Scrum maste",
            company: "VGCS",
            date: "2022-2023",
            description: "Lorem ipsum dolor sit amet, consectetur adipiscing elit. " +
                "Curabitur vitae luctus massa. Suspendisse potenti. " +
                "Nunc accumsan volutpat posuere. Curabitur fringilla felis non sapien" +
                " molestie, vitae sagittis tortor eleifend."
        }
    ])

    return (
        <div className="profile-container">
            <div className="name-container">
                <label>First Name
                    <input type="text" name="firstname" />
                </label>
                <label>Last Name
                    <input type="text" name="lastname" />
                </label>
            </div>
            <label>Email
                <input type="email" name="email" />
            </label>
            <label>About
                <input type="text" name="about" />
            </label>
            <div className="profile-portfolio">
                <div className="profile-portfolio-header">
                    <p>Portfolio</p>
                    <button>+</button>
                </div>
                <div>
                 {portfolio.map(item => (
                    <PortfolioItem
                        title = {item.title}
                        company = {item.company}
                        date = {item.date}
                        description={item.description}
                    />
                      ))}
                </div>
            </div>
        </div>
    )
}

export default ProfileView;