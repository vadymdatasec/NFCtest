public class c.h.e.x extends c.h.e.d0 {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public android.graphics.Bitmap e;
	 public androidx.core.graphics.drawable.IconCompat f;
	 public Boolean g;
	 public Boolean h;
	 /* # direct methods */
	 public c.h.e.x ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Lc/h/e/d0;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public c.h.e.x a ( android.graphics.Bitmap p0 ) {
		 /* .locals 0 */
		 /* if-nez p1, :cond_0 */
		 int p1 = 0; // const/4 p1, 0x0
		 /* .line 1 */
	 } // :cond_0
	 androidx.core.graphics.drawable.IconCompat .a ( p1 );
} // :goto_0
this.f = p1;
int p1 = 1; // const/4 p1, 0x1
/* .line 2 */
/* iput-boolean p1, p0, Lc/h/e/x;->g:Z */
} // .end method
public java.lang.String a ( ) {
/* .locals 1 */
final String v0 = "androidx.core.app.NotificationCompat$BigPictureStyle"; // const-string v0, "androidx.core.app.NotificationCompat$BigPictureStyle"
} // .end method
public void a ( Object p0 ) {
/* .locals 5 */
/* .line 3 */
/* const/16 v1, 0x10 */
/* if-lt v0, v1, :cond_6 */
/* .line 4 */
/* new-instance v0, Landroid/app/Notification$BigPictureStyle; */
/* .line 5 */
/* invoke-direct {v0, v1}, Landroid/app/Notification$BigPictureStyle;-><init>(Landroid/app/Notification$Builder;)V */
v1 = this.b;
/* .line 6 */
(( android.app.Notification$BigPictureStyle ) v0 ).setBigContentTitle ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/Notification$BigPictureStyle;->setBigContentTitle(Ljava/lang/CharSequence;)Landroid/app/Notification$BigPictureStyle;
v1 = this.e;
/* .line 7 */
(( android.app.Notification$BigPictureStyle ) v0 ).bigPicture ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/Notification$BigPictureStyle;->bigPicture(Landroid/graphics/Bitmap;)Landroid/app/Notification$BigPictureStyle;
/* .line 8 */
/* iget-boolean v1, p0, Lc/h/e/x;->g:Z */
if ( v1 != null) { // if-eqz v1, :cond_4
	 /* .line 9 */
	 v1 = this.f;
	 int v2 = 0; // const/4 v2, 0x0
	 /* if-nez v1, :cond_0 */
	 /* .line 10 */
	 c.h.e.u .a ( v0,v2 );
	 /* .line 11 */
} // :cond_0
/* const/16 v4, 0x17 */
/* if-lt v3, v4, :cond_2 */
/* .line 12 */
/* instance-of v1, p1, Lc/h/e/e0; */
if ( v1 != null) { // if-eqz v1, :cond_1
	 /* .line 13 */
	 /* check-cast p1, Lc/h/e/e0; */
	 (( c.h.e.e0 ) p1 ).d ( ); // invoke-virtual {p1}, Lc/h/e/e0;->d()Landroid/content/Context;
	 /* .line 14 */
} // :cond_1
p1 = this.f;
(( androidx.core.graphics.drawable.IconCompat ) p1 ).b ( v2 ); // invoke-virtual {p1, v2}, Landroidx/core/graphics/drawable/IconCompat;->b(Landroid/content/Context;)Landroid/graphics/drawable/Icon;
c.h.e.v .a ( v0,p1 );
/* .line 15 */
} // :cond_2
p1 = (( androidx.core.graphics.drawable.IconCompat ) v1 ).d ( ); // invoke-virtual {v1}, Landroidx/core/graphics/drawable/IconCompat;->d()I
int v1 = 1; // const/4 v1, 0x1
/* if-ne p1, v1, :cond_3 */
/* .line 16 */
p1 = this.f;
(( androidx.core.graphics.drawable.IconCompat ) p1 ).a ( ); // invoke-virtual {p1}, Landroidx/core/graphics/drawable/IconCompat;->a()Landroid/graphics/Bitmap;
c.h.e.u .a ( v0,p1 );
/* .line 17 */
} // :cond_3
c.h.e.u .a ( v0,v2 );
/* .line 18 */
} // :cond_4
} // :goto_0
/* iget-boolean p1, p0, Lc/h/e/d0;->d:Z */
if ( p1 != null) { // if-eqz p1, :cond_5
/* .line 19 */
p1 = this.c;
c.h.e.u .a ( v0,p1 );
/* .line 20 */
} // :cond_5
/* const/16 v1, 0x1f */
/* if-lt p1, v1, :cond_6 */
/* .line 21 */
/* iget-boolean p1, p0, Lc/h/e/x;->h:Z */
c.h.e.w .a ( v0,p1 );
} // :cond_6
return;
} // .end method
public c.h.e.x b ( android.graphics.Bitmap p0 ) {
/* .locals 0 */
/* .line 1 */
this.e = p1;
} // .end method
