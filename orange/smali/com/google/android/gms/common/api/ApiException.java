public class com.google.android.gms.common.api.ApiException extends java.lang.Exception {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public com.google.android.gms.common.api.ApiException ( ) {
		 /* .locals 3 */
		 /* .line 1 */
		 v0 = 		 (( com.google.android.gms.common.api.Status ) p1 ).a ( ); // invoke-virtual {p1}, Lcom/google/android/gms/common/api/Status;->a()I
		 /* .line 2 */
		 (( com.google.android.gms.common.api.Status ) p1 ).b ( ); // invoke-virtual {p1}, Lcom/google/android/gms/common/api/Status;->b()Ljava/lang/String;
		 if ( v1 != null) { // if-eqz v1, :cond_0
			 (( com.google.android.gms.common.api.Status ) p1 ).b ( ); // invoke-virtual {p1}, Lcom/google/android/gms/common/api/Status;->b()Ljava/lang/String;
		 } // :cond_0
		 final String p1 = ""; // const-string p1, ""
	 } // :goto_0
	 java.lang.String .valueOf ( p1 );
	 v1 = 	 (( java.lang.String ) v1 ).length ( ); // invoke-virtual {v1}, Ljava/lang/String;->length()I
	 /* add-int/lit8 v1, v1, 0xd */
	 /* new-instance v2, Ljava/lang/StringBuilder; */
	 /* invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V */
	 (( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
	 final String v0 = ": "; // const-string v0, ": "
	 (( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v2 ).append ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 /* .line 3 */
	 /* invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V */
	 return;
} // .end method
