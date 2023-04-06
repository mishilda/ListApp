package com.example.tutorialproject.domain

class ShopItemUseCases(private val shopListRepository: ShopListRepository) {

    fun AddShopItem(shopItem: ShopItem) {
        shopListRepository.addShopItem(shopItem)
    }

    fun getShopItem(shopItemId: Int): ShopItem {
        return shopListRepository.getShopItem(shopItemId)
    }

    fun editShopItem(shopItem: ShopItem) {
        shopListRepository.editShopItem(shopItem)
    }

    fun deleteShopItem(shopItem: ShopItem) {
        shopListRepository.deleteShopItem(shopItem)
    }
}