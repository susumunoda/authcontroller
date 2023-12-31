package com.susumunoda.auth

class User(val id: String) {
    companion object {
        val ANONYMOUS = User("")
    }

    override fun toString() = "User(id=$id)"
}