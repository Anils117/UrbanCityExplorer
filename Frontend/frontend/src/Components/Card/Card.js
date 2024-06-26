import React, { useEffect } from 'react'
import './Card.css'
import { useNavigate } from 'react-router-dom'

function Card({place}) {

  const navigate = useNavigate();

  return (
    <div onClick={() => {navigate(`/${place.city}/place/${place.placeName}`,{state:place.id})}} className='card'>
        <img className="cardImage" src={place.mainImage}/>
        <div className='cardContent'>
            <span className='cardRating'>{place.rating==null ? 4.5 : Math.round(place.rating*10)/10}</span>
            <span className='cardPlace'>{place.placeName}</span>
            <span className='cardCategory'>{place.category}</span>
        </div>
    </div>
  )
}

export default Card