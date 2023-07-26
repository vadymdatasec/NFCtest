public class android.support.v4.media.MediaBrowserCompat$ItemReceiver extends b.a.a.b.g {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final java.lang.String d;
	 public final b.a.a.a.b e;
	 /* # virtual methods */
	 public void a ( Integer p0, android.os.Bundle p1 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 android.support.v4.media.session.MediaSessionCompat .a ( p2 );
		 /* if-nez p1, :cond_3 */
		 if ( p2 != null) { // if-eqz p2, :cond_3
			 final String p1 = "media_item"; // const-string p1, "media_item"
			 /* .line 2 */
			 v0 = 			 (( android.os.Bundle ) p2 ).containsKey ( p1 ); // invoke-virtual {p2, p1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z
			 /* if-nez v0, :cond_0 */
			 /* .line 3 */
		 } // :cond_0
		 (( android.os.Bundle ) p2 ).getParcelable ( p1 ); // invoke-virtual {p2, p1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;
		 if ( p1 != null) { // if-eqz p1, :cond_2
			 /* .line 4 */
			 /* instance-of p2, p1, Landroid/support/v4/media/MediaBrowserCompat$MediaItem; */
			 if ( p2 != null) { // if-eqz p2, :cond_1
				 /* .line 5 */
			 } // :cond_1
			 p1 = this.e;
			 p2 = this.d;
			 (( b.a.a.a.b ) p1 ).a ( p2 ); // invoke-virtual {p1, p2}, Lb/a/a/a/b;->a(Ljava/lang/String;)V
			 /* .line 6 */
		 } // :cond_2
	 } // :goto_0
	 p2 = this.e;
	 /* check-cast p1, Landroid/support/v4/media/MediaBrowserCompat$MediaItem; */
	 (( b.a.a.a.b ) p2 ).a ( p1 ); // invoke-virtual {p2, p1}, Lb/a/a/a/b;->a(Landroid/support/v4/media/MediaBrowserCompat$MediaItem;)V
} // :goto_1
return;
/* .line 7 */
} // :cond_3
} // :goto_2
p1 = this.e;
p2 = this.d;
(( b.a.a.a.b ) p1 ).a ( p2 ); // invoke-virtual {p1, p2}, Lb/a/a/a/b;->a(Ljava/lang/String;)V
return;
} // .end method
