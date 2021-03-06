
            
import CommonBase from './CommonBase';
import * as bindings from '../bindings' // TODO: figure out location



            export class MessageSendEventsProvider extends CommonBase {

                bindings_instance?: bindings.LDKMessageSendEventsProvider;

                constructor(ptr?: number, arg?: bindings.LDKMessageSendEventsProvider) {
                    if (Number.isFinite(ptr)) {
				        super(ptr);
				        this.bindings_instance = null;
				    } else {
				        // TODO: private constructor instantiation
				        super(bindings.LDKMessageSendEventsProvider_new(arg));
				        this.ptrs_to.push(arg);
				        
				    }
                }

                protected finalize() {
                    if (this.ptr != 0) {
                        bindings.MessageSendEventsProvider_free(this.ptr);
                    }
                    super.finalize();
                }

                static new_impl(arg: MessageSendEventsProviderInterface): MessageSendEventsProvider {
                    const impl_holder: LDKMessageSendEventsProviderHolder = new LDKMessageSendEventsProviderHolder();
                    let structImplementation = <bindings.LDKMessageSendEventsProvider>{
                        // todo: in-line interface filling
                        get_and_clear_pending_msg_events (): number[] {
							MessageSendEvent[] ret = arg.get_and_clear_pending_msg_events();
				result: number[] = (number[])Arrays.stream(ret).map(arr_conv_18 -> arr_conv_18.ptr).toArray();
				/* TODO 2 MessageSendEvent  */;
				return result;
						},

						
                    };
                    impl_holder.held = new MessageSendEventsProvider (null, structImplementation);
                }
            }

            export interface MessageSendEventsProviderInterface {
                get_and_clear_pending_msg_events(): MessageSendEvent[];
				
            }

            class LDKMessageSendEventsProviderHolder {
                held: MessageSendEventsProvider;
            }
	public MessageSendEvent[] get_and_clear_pending_msg_events() {
		number[] ret = bindings.MessageSendEventsProvider_get_and_clear_pending_msg_events(this.ptr);
		MessageSendEvent[] arr_conv_18_arr = new MessageSendEvent[ret.length];
		for (int s = 0; s < ret.length; s++) {
			number arr_conv_18 = ret[s];
			MessageSendEvent arr_conv_18_hu_conv = MessageSendEvent.constr_from_ptr(arr_conv_18);
			arr_conv_18_hu_conv.ptrs_to.add(this);
			arr_conv_18_arr[s] = arr_conv_18_hu_conv;
		}
		return arr_conv_18_arr;
	}

}
