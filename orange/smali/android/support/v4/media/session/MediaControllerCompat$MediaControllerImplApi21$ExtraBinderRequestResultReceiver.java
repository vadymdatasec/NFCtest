public class android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver extends android.os.ResultReceiver {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Landroid/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x9 */
/* name = "ExtraBinderRequestResultReceiver" */
} // .end annotation
/* # instance fields */
public java.lang.ref.WeakReference b;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/lang/ref/WeakReference<", */
/* "Landroid/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
/* # virtual methods */
public void onReceiveResult ( Integer p0, android.os.Bundle p1 ) {
/* .locals 3 */
/* .line 1 */
p1 = this.b;
(( java.lang.ref.WeakReference ) p1 ).get ( ); // invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
/* check-cast p1, Landroid/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21; */
if ( p1 != null) { // if-eqz p1, :cond_1
/* if-nez p2, :cond_0 */
/* .line 2 */
} // :cond_0
v0 = this.a;
/* monitor-enter v0 */
/* .line 3 */
try { // :try_start_0
v1 = this.b;
final String v2 = "android.support.v4.media.session.EXTRA_BINDER"; // const-string v2, "android.support.v4.media.session.EXTRA_BINDER"
/* .line 4 */
c.h.e.o .a ( p2,v2 );
/* .line 5 */
b.a.a.a.f.b$a .a ( v2 );
/* .line 6 */
(( android.support.v4.media.session.MediaSessionCompat$Token ) v1 ).a ( v2 ); // invoke-virtual {v1, v2}, Landroid/support/v4/media/session/MediaSessionCompat$Token;->a(Lb/a/a/a/f/b;)V
/* .line 7 */
v1 = this.b;
final String v2 = "android.support.v4.media.session.SESSION_TOKEN2_BUNDLE"; // const-string v2, "android.support.v4.media.session.SESSION_TOKEN2_BUNDLE"
/* .line 8 */
(( android.os.Bundle ) p2 ).getBundle ( v2 ); // invoke-virtual {p2, v2}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;
/* .line 9 */
(( android.support.v4.media.session.MediaSessionCompat$Token ) v1 ).a ( p2 ); // invoke-virtual {v1, p2}, Landroid/support/v4/media/session/MediaSessionCompat$Token;->a(Landroid/os/Bundle;)V
/* .line 10 */
(( android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21 ) p1 ).a ( ); // invoke-virtual {p1}, Landroid/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21;->a()V
/* .line 11 */
/* monitor-exit v0 */
return;
/* :catchall_0 */
/* move-exception p1 */
/* monitor-exit v0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw p1 */
} // :cond_1
} // :goto_0
return;
} // .end method
