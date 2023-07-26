public class androidx.lifecycle.FullLifecycleObserverAdapter implements c.n.h {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final c.n.c a;
	 public final c.n.h b;
	 /* # virtual methods */
	 public void a ( Object p0, c.n.g$a p1 ) {
		 /* .locals 2 */
		 /* .line 1 */
		 v0 = androidx.lifecycle.FullLifecycleObserverAdapter$a.a;
		 v1 = 		 (( java.lang.Enum ) p2 ).ordinal ( ); // invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I
		 /* aget v0, v0, v1 */
		 /* packed-switch v0, :pswitch_data_0 */
		 /* .line 2 */
		 /* :pswitch_0 */
		 /* new-instance p1, Ljava/lang/IllegalArgumentException; */
		 final String p2 = "ON_ANY must not been send by anybody"; // const-string p2, "ON_ANY must not been send by anybody"
		 /* invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
		 /* throw p1 */
		 /* .line 3 */
		 /* :pswitch_1 */
		 v0 = this.a;
		 /* .line 4 */
		 /* :pswitch_2 */
		 v0 = this.a;
		 /* .line 5 */
		 /* :pswitch_3 */
		 v0 = this.a;
		 /* .line 6 */
		 /* :pswitch_4 */
		 v0 = this.a;
		 /* .line 7 */
		 /* :pswitch_5 */
		 v0 = this.a;
		 /* .line 8 */
		 /* :pswitch_6 */
		 v0 = this.a;
		 /* .line 9 */
	 } // :goto_0
	 v0 = this.b;
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 10 */
	 } // :cond_0
	 return;
	 /* nop */
	 /* :pswitch_data_0 */
	 /* .packed-switch 0x1 */
	 /* :pswitch_6 */
	 /* :pswitch_5 */
	 /* :pswitch_4 */
	 /* :pswitch_3 */
	 /* :pswitch_2 */
	 /* :pswitch_1 */
	 /* :pswitch_0 */
} // .end packed-switch
} // .end method
