package org.ldk.structs;

import org.ldk.impl.bindings;

import org.ldk.enums.*;

public class ChannelMessageHandler extends CommonBase {
	ChannelMessageHandler(Object _dummy, long ptr) { super(ptr); }
	public ChannelMessageHandler(bindings.LDKChannelMessageHandler arg, bindings.LDKMessageSendEventsProvider MessageSendEventsProvider) {
		super(bindings.LDKChannelMessageHandler_new(arg, MessageSendEventsProvider));
		this.ptrs_to.add(arg);
	}
	@Override @SuppressWarnings("deprecation")
	protected void finalize() throws Throwable {
		bindings.ChannelMessageHandler_free(ptr); super.finalize();
	}

	public void call_handle_open_channel(byte[] their_node_id, InitFeatures their_features, OpenChannel msg) {
		bindings.ChannelMessageHandler_call_handle_open_channel(this.ptr, their_node_id, their_features.ptr & ~1, msg.ptr & ~1);
		this.ptrs_to.add(their_features);
		this.ptrs_to.add(msg);
	}

	public void call_handle_accept_channel(byte[] their_node_id, InitFeatures their_features, AcceptChannel msg) {
		bindings.ChannelMessageHandler_call_handle_accept_channel(this.ptr, their_node_id, their_features.ptr & ~1, msg.ptr & ~1);
		this.ptrs_to.add(their_features);
		this.ptrs_to.add(msg);
	}

	public void call_handle_funding_created(byte[] their_node_id, FundingCreated msg) {
		bindings.ChannelMessageHandler_call_handle_funding_created(this.ptr, their_node_id, msg.ptr & ~1);
		this.ptrs_to.add(msg);
	}

	public void call_handle_funding_signed(byte[] their_node_id, FundingSigned msg) {
		bindings.ChannelMessageHandler_call_handle_funding_signed(this.ptr, their_node_id, msg.ptr & ~1);
		this.ptrs_to.add(msg);
	}

	public void call_handle_funding_locked(byte[] their_node_id, FundingLocked msg) {
		bindings.ChannelMessageHandler_call_handle_funding_locked(this.ptr, their_node_id, msg.ptr & ~1);
		this.ptrs_to.add(msg);
	}

	public void call_handle_shutdown(byte[] their_node_id, Shutdown msg) {
		bindings.ChannelMessageHandler_call_handle_shutdown(this.ptr, their_node_id, msg.ptr & ~1);
		this.ptrs_to.add(msg);
	}

	public void call_handle_closing_signed(byte[] their_node_id, ClosingSigned msg) {
		bindings.ChannelMessageHandler_call_handle_closing_signed(this.ptr, their_node_id, msg.ptr & ~1);
		this.ptrs_to.add(msg);
	}

	public void call_handle_update_add_htlc(byte[] their_node_id, UpdateAddHTLC msg) {
		bindings.ChannelMessageHandler_call_handle_update_add_htlc(this.ptr, their_node_id, msg.ptr & ~1);
		this.ptrs_to.add(msg);
	}

	public void call_handle_update_fulfill_htlc(byte[] their_node_id, UpdateFulfillHTLC msg) {
		bindings.ChannelMessageHandler_call_handle_update_fulfill_htlc(this.ptr, their_node_id, msg.ptr & ~1);
		this.ptrs_to.add(msg);
	}

	public void call_handle_update_fail_htlc(byte[] their_node_id, UpdateFailHTLC msg) {
		bindings.ChannelMessageHandler_call_handle_update_fail_htlc(this.ptr, their_node_id, msg.ptr & ~1);
		this.ptrs_to.add(msg);
	}

	public void call_handle_update_fail_malformed_htlc(byte[] their_node_id, UpdateFailMalformedHTLC msg) {
		bindings.ChannelMessageHandler_call_handle_update_fail_malformed_htlc(this.ptr, their_node_id, msg.ptr & ~1);
		this.ptrs_to.add(msg);
	}

	public void call_handle_commitment_signed(byte[] their_node_id, CommitmentSigned msg) {
		bindings.ChannelMessageHandler_call_handle_commitment_signed(this.ptr, their_node_id, msg.ptr & ~1);
		this.ptrs_to.add(msg);
	}

	public void call_handle_revoke_and_ack(byte[] their_node_id, RevokeAndACK msg) {
		bindings.ChannelMessageHandler_call_handle_revoke_and_ack(this.ptr, their_node_id, msg.ptr & ~1);
		this.ptrs_to.add(msg);
	}

	public void call_handle_update_fee(byte[] their_node_id, UpdateFee msg) {
		bindings.ChannelMessageHandler_call_handle_update_fee(this.ptr, their_node_id, msg.ptr & ~1);
		this.ptrs_to.add(msg);
	}

	public void call_handle_announcement_signatures(byte[] their_node_id, AnnouncementSignatures msg) {
		bindings.ChannelMessageHandler_call_handle_announcement_signatures(this.ptr, their_node_id, msg.ptr & ~1);
		this.ptrs_to.add(msg);
	}

	public void call_peer_disconnected(byte[] their_node_id, boolean no_connection_possible) {
		bindings.ChannelMessageHandler_call_peer_disconnected(this.ptr, their_node_id, no_connection_possible);
	}

	public void call_peer_connected(byte[] their_node_id, Init msg) {
		bindings.ChannelMessageHandler_call_peer_connected(this.ptr, their_node_id, msg.ptr & ~1);
		this.ptrs_to.add(msg);
	}

	public void call_handle_channel_reestablish(byte[] their_node_id, ChannelReestablish msg) {
		bindings.ChannelMessageHandler_call_handle_channel_reestablish(this.ptr, their_node_id, msg.ptr & ~1);
		this.ptrs_to.add(msg);
	}

	public void call_handle_error(byte[] their_node_id, ErrorMessage msg) {
		bindings.ChannelMessageHandler_call_handle_error(this.ptr, their_node_id, msg.ptr & ~1);
		this.ptrs_to.add(msg);
	}

}