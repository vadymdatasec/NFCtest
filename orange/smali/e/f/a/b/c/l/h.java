public abstract class e.f.a.b.c.l.h {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static java.lang.String a ( Integer p0 ) {
		 /* .locals 2 */
		 /* packed-switch p0, :pswitch_data_0 */
		 /* :pswitch_0 */
		 /* const/16 v0, 0x20 */
		 /* .line 1 */
		 /* new-instance v1, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V */
		 final String v0 = "unknown status code: "; // const-string v0, "unknown status code: "
		 (( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 /* :pswitch_1 */
		 final String p0 = "DEAD_CLIENT"; // const-string p0, "DEAD_CLIENT"
		 /* :pswitch_2 */
		 final String p0 = "API_NOT_CONNECTED"; // const-string p0, "API_NOT_CONNECTED"
		 /* :pswitch_3 */
		 final String p0 = "CANCELED"; // const-string p0, "CANCELED"
		 /* :pswitch_4 */
		 final String p0 = "TIMEOUT"; // const-string p0, "TIMEOUT"
		 /* :pswitch_5 */
		 final String p0 = "INTERRUPTED"; // const-string p0, "INTERRUPTED"
		 /* :pswitch_6 */
		 final String p0 = "ERROR"; // const-string p0, "ERROR"
		 /* :pswitch_7 */
		 final String p0 = "DEVELOPER_ERROR"; // const-string p0, "DEVELOPER_ERROR"
		 /* :pswitch_8 */
		 final String p0 = "INTERNAL_ERROR"; // const-string p0, "INTERNAL_ERROR"
		 /* :pswitch_9 */
		 final String p0 = "NETWORK_ERROR"; // const-string p0, "NETWORK_ERROR"
		 /* :pswitch_a */
		 final String p0 = "RESOLUTION_REQUIRED"; // const-string p0, "RESOLUTION_REQUIRED"
		 /* :pswitch_b */
		 final String p0 = "INVALID_ACCOUNT"; // const-string p0, "INVALID_ACCOUNT"
		 /* :pswitch_c */
		 final String p0 = "SIGN_IN_REQUIRED"; // const-string p0, "SIGN_IN_REQUIRED"
		 /* :pswitch_d */
		 final String p0 = "SERVICE_DISABLED"; // const-string p0, "SERVICE_DISABLED"
		 /* :pswitch_e */
		 final String p0 = "SERVICE_VERSION_UPDATE_REQUIRED"; // const-string p0, "SERVICE_VERSION_UPDATE_REQUIRED"
		 /* :pswitch_f */
		 final String p0 = "SUCCESS"; // const-string p0, "SUCCESS"
		 /* :pswitch_10 */
		 final String p0 = "SUCCESS_CACHE"; // const-string p0, "SUCCESS_CACHE"
		 /* nop */
		 /* :pswitch_data_0 */
		 /* .packed-switch -0x1 */
		 /* :pswitch_10 */
		 /* :pswitch_f */
		 /* :pswitch_0 */
		 /* :pswitch_e */
		 /* :pswitch_d */
		 /* :pswitch_c */
		 /* :pswitch_b */
		 /* :pswitch_a */
		 /* :pswitch_9 */
		 /* :pswitch_8 */
		 /* :pswitch_0 */
		 /* :pswitch_7 */
		 /* :pswitch_0 */
		 /* :pswitch_0 */
		 /* :pswitch_6 */
		 /* :pswitch_5 */
		 /* :pswitch_4 */
		 /* :pswitch_3 */
		 /* :pswitch_2 */
		 /* :pswitch_1 */
	 } // .end packed-switch
} // .end method
