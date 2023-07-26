public class android.support.v4.media.MediaBrowserCompat$SearchResultReceiver extends b.a.a.b.g {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final java.lang.String d;
	 public final android.os.Bundle e;
	 public final b.a.a.a.c f;
	 /* # virtual methods */
	 public void a ( Integer p0, android.os.Bundle p1 ) {
		 /* .locals 3 */
		 /* .line 1 */
		 android.support.v4.media.session.MediaSessionCompat .a ( p2 );
		 /* if-nez p1, :cond_2 */
		 if ( p2 != null) { // if-eqz p2, :cond_2
			 final String p1 = "search_results"; // const-string p1, "search_results"
			 /* .line 2 */
			 v0 = 			 (( android.os.Bundle ) p2 ).containsKey ( p1 ); // invoke-virtual {p2, p1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z
			 /* if-nez v0, :cond_0 */
			 /* .line 3 */
		 } // :cond_0
		 (( android.os.Bundle ) p2 ).getParcelableArray ( p1 ); // invoke-virtual {p2, p1}, Landroid/os/Bundle;->getParcelableArray(Ljava/lang/String;)[Landroid/os/Parcelable;
		 int p2 = 0; // const/4 p2, 0x0
		 if ( p1 != null) { // if-eqz p1, :cond_1
			 /* .line 4 */
			 /* new-instance p2, Ljava/util/ArrayList; */
			 /* invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V */
			 /* .line 5 */
			 /* array-length v0, p1 */
			 int v1 = 0; // const/4 v1, 0x0
		 } // :goto_0
		 /* if-ge v1, v0, :cond_1 */
		 /* aget-object v2, p1, v1 */
		 /* .line 6 */
		 /* check-cast v2, Landroid/support/v4/media/MediaBrowserCompat$MediaItem; */
		 /* add-int/lit8 v1, v1, 0x1 */
		 /* .line 7 */
	 } // :cond_1
	 p1 = this.f;
	 v0 = this.d;
	 v1 = this.e;
	 (( b.a.a.a.c ) p1 ).a ( v0, v1, p2 ); // invoke-virtual {p1, v0, v1, p2}, Lb/a/a/a/c;->a(Ljava/lang/String;Landroid/os/Bundle;Ljava/util/List;)V
	 return;
	 /* .line 8 */
} // :cond_2
} // :goto_1
p1 = this.f;
p2 = this.d;
v0 = this.e;
(( b.a.a.a.c ) p1 ).a ( p2, v0 ); // invoke-virtual {p1, p2, v0}, Lb/a/a/a/c;->a(Ljava/lang/String;Landroid/os/Bundle;)V
return;
} // .end method
