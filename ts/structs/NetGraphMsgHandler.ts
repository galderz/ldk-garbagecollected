
            
import CommonBase from './CommonBase';
import * as bindings from '../bindings' // TODO: figure out location



            export default class NetGraphMsgHandler extends CommonBase {
                constructor(_dummy: object, ptr: number) {
                    super(ptr);
                }

                
                protected finalize() {
                    super.finalize();

                    if (this.ptr != 0) {
                        bindings.NetGraphMsgHandler_free(this.ptr);
                    }
                }
	public static NetGraphMsgHandler constructor_new(Uint8Array genesis_hash, Access chain_access, Logger logger) {
		number ret = bindings.NetGraphMsgHandler_new(genesis_hash, chain_access == null ? 0 : chain_access.ptr, logger == null ? 0 : logger.ptr);
		const ret_hu_conv: NetGraphMsgHandler = new NetGraphMsgHandler(null, ret);
		ret_hu_conv.ptrs_to.add(ret_hu_conv);
		ret_hu_conv.ptrs_to.add(chain_access);
		ret_hu_conv.ptrs_to.add(logger);
		return ret_hu_conv;
	}

	public static NetGraphMsgHandler constructor_from_net_graph(Access chain_access, Logger logger, Uint8Array network_graph_genesis_hash) {
		number ret = bindings.NetGraphMsgHandler_from_net_graph(chain_access == null ? 0 : chain_access.ptr, logger == null ? 0 : logger.ptr, bindings.NetworkGraph_new(network_graph_genesis_hash));
		const ret_hu_conv: NetGraphMsgHandler = new NetGraphMsgHandler(null, ret);
		ret_hu_conv.ptrs_to.add(ret_hu_conv);
		ret_hu_conv.ptrs_to.add(chain_access);
		ret_hu_conv.ptrs_to.add(logger);
		return ret_hu_conv;
	}

	public LockedNetworkGraph read_locked_graph() {
		number ret = bindings.NetGraphMsgHandler_read_locked_graph(this.ptr);
		const ret_hu_conv: LockedNetworkGraph = new LockedNetworkGraph(null, ret);
		ret_hu_conv.ptrs_to.add(this);
		return ret_hu_conv;
	}

	public RoutingMessageHandler as_RoutingMessageHandler() {
		number ret = bindings.NetGraphMsgHandler_as_RoutingMessageHandler(this.ptr);
		RoutingMessageHandler ret_hu_conv = new RoutingMessageHandler(null, ret);
		ret_hu_conv.ptrs_to.add(this);
		return ret_hu_conv;
	}

	public MessageSendEventsProvider as_MessageSendEventsProvider() {
		number ret = bindings.NetGraphMsgHandler_as_MessageSendEventsProvider(this.ptr);
		MessageSendEventsProvider ret_hu_conv = new MessageSendEventsProvider(null, ret);
		ret_hu_conv.ptrs_to.add(this);
		return ret_hu_conv;
	}

}
