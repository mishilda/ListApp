package com.example.tutorialproject.domain

class AddShopItemUseCase(private val shopListRepository: ShopListRepository) {

    fun AddShopItem(shopItem: ShopItem) {
        shopListRepository.addShopItem(shopItem)
    }
}
