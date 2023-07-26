public class inal {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final android.content.IntentFilter a;
	 public final android.content.BroadcastReceiver b;
	 public Boolean c;
	 public Boolean d;
	 /* # direct methods */
	 public inal ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 this.a = p1;
		 /* .line 3 */
		 this.b = p2;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public java.lang.String toString ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 /* new-instance v0, Ljava/lang/StringBuilder; */
		 /* const/16 v1, 0x80 */
		 /* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V */
		 final String v1 = "Receiver{"; // const-string v1, "Receiver{"
		 /* .line 2 */
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 /* .line 3 */
		 v1 = this.b;
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
		 final String v1 = " filter="; // const-string v1, " filter="
		 /* .line 4 */
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 /* .line 5 */
		 v1 = this.a;
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
		 /* .line 6 */
		 /* iget-boolean v1, p0, Lc/p/a/c;->d:Z */
		 if ( v1 != null) { // if-eqz v1, :cond_0
			 final String v1 = " DEAD"; // const-string v1, " DEAD"
			 /* .line 7 */
			 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 } // :cond_0
		 final String v1 = "}"; // const-string v1, "}"
		 /* .line 8 */
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 /* .line 9 */
		 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 } // .end method
