public class android.support.v4.media.MediaBrowserCompat$CustomActionResultReceiver extends b.a.a.b.g {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final java.lang.String d;
	 public final android.os.Bundle e;
	 public final b.a.a.a.a f;
	 /* # virtual methods */
	 public void a ( Integer p0, android.os.Bundle p1 ) {
		 /* .locals 2 */
		 /* .line 1 */
		 v0 = this.f;
		 /* if-nez v0, :cond_0 */
		 return;
		 /* .line 2 */
	 } // :cond_0
	 android.support.v4.media.session.MediaSessionCompat .a ( p2 );
	 int v0 = -1; // const/4 v0, -0x1
	 /* if-eq p1, v0, :cond_3 */
	 if ( p1 != null) { // if-eqz p1, :cond_2
		 int v0 = 1; // const/4 v0, 0x1
		 /* if-eq p1, v0, :cond_1 */
		 /* .line 3 */
		 /* new-instance v0, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
		 final String v1 = "Unknown result code: "; // const-string v1, "Unknown result code: "
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
		 final String p1 = " (extras="; // const-string p1, " (extras="
		 (( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 p1 = this.e;
		 (( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
		 final String p1 = ", resultData="; // const-string p1, ", resultData="
		 (( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v0 ).append ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
		 final String p1 = ")"; // const-string p1, ")"
		 (( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 final String p2 = "MediaBrowserCompat"; // const-string p2, "MediaBrowserCompat"
		 android.util.Log .w ( p2,p1 );
		 /* .line 4 */
	 } // :cond_1
	 p1 = this.f;
	 v0 = this.d;
	 v1 = this.e;
	 (( b.a.a.a.a ) p1 ).b ( v0, v1, p2 ); // invoke-virtual {p1, v0, v1, p2}, Lb/a/a/a/a;->b(Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;)V
	 /* .line 5 */
} // :cond_2
p1 = this.f;
v0 = this.d;
v1 = this.e;
(( b.a.a.a.a ) p1 ).c ( v0, v1, p2 ); // invoke-virtual {p1, v0, v1, p2}, Lb/a/a/a/a;->c(Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;)V
/* .line 6 */
} // :cond_3
p1 = this.f;
v0 = this.d;
v1 = this.e;
(( b.a.a.a.a ) p1 ).a ( v0, v1, p2 ); // invoke-virtual {p1, v0, v1, p2}, Lb/a/a/a/a;->a(Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;)V
} // :goto_0
return;
} // .end method
