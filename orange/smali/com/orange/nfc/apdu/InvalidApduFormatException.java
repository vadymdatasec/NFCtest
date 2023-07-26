public class com.orange.nfc.apdu.InvalidApduFormatException extends java.lang.RuntimeException {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public com.orange.nfc.apdu.InvalidApduFormatException ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 com.orange.nfc.apdu.InvalidApduFormatException .a ( p1 );
		 /* invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V */
		 return;
	 } // .end method
	 public static java.lang.String a ( java.lang.String p0 ) {
		 /* .locals 2 */
		 /* .line 1 */
		 /* new-instance v0, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
		 final String v1 = "Invalid apdu format : "; // const-string v1, "Invalid apdu format : "
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v0 ).append ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 } // .end method
