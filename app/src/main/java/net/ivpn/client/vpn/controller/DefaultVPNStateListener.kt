package net.ivpn.client.vpn.controller

/*
 IVPN Android app
 https://github.com/ivpn/android-app
 
 Created by Oleksandr Mykhailenko.
 Copyright (c) 2020 Privatus Limited.
 
 This file is part of the IVPN Android app.
 
 The IVPN Android app is free software: you can redistribute it and/or
 modify it under the terms of the GNU General Public License as published by the Free
 Software Foundation, either version 3 of the License, or (at your option) any later version.
 
 The IVPN Android app is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more
 details.
 
 You should have received a copy of the GNU General Public License
 along with the IVPN Android app. If not, see <https://www.gnu.org/licenses/>.
*/

import net.ivpn.client.common.prefs.ServerType
import net.ivpn.client.rest.data.model.Server
import net.ivpn.client.ui.connect.ConnectionState
import net.ivpn.client.ui.dialog.Dialogs

open class DefaultVPNStateListener: VpnStateListener {
    override fun onAuthFailed() {
    }

    override fun onRegenerationError(errorDialog: Dialogs?) {
    }

    override fun onFindingFastestServer() {
    }

    override fun notifyAnotherPortUsedToConnect() {
    }

    override fun notifyServerAsFastest(server: Server) {
    }

    override fun notifyServerAsRandom(server: Server, serverType: ServerType) {
    }

    override fun onTimeTick(millisUntilResumed: Long) {
    }

    override fun onTimerFinish() {
    }

    override fun onRegeneratingKeys() {
    }

    override fun notifyNoNetworkConnection() {
    }

    override fun onCheckSessionState() {
    }

    override fun onConnectionStateChanged(state: ConnectionState?) {
    }

    override fun onTimeOut() {
    }

    override fun onRegenerationSuccess() {
    }
}