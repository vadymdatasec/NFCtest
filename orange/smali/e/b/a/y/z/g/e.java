public abstract class e.b.a.y.z.g.e {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static volatile Boolean a;
	 /* # direct methods */
	 public static e.b.a.y.z.g.e ( ) {
		 /* .locals 0 */
		 return;
	 } // .end method
	 public static android.graphics.drawable.Drawable a ( android.content.Context p0, Integer p1, android.content.res.Resources$Theme p2 ) {
		 /* .locals 0 */
		 /* .line 2 */
		 e.b.a.y.z.g.e .a ( p0,p0,p1,p2 );
	 } // .end method
	 public static android.graphics.drawable.Drawable a ( android.content.Context p0, android.content.Context p1, Integer p2 ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 1 */
		 e.b.a.y.z.g.e .a ( p0,p1,p2,v0 );
	 } // .end method
	 public static android.graphics.drawable.Drawable a ( android.content.Context p0, android.content.Context p1, Integer p2, android.content.res.Resources$Theme p3 ) {
		 /* .locals 1 */
		 /* .line 3 */
		 try { // :try_start_0
			 /* sget-boolean v0, Le/b/a/y/z/g/e;->a:Z */
			 if ( v0 != null) { // if-eqz v0, :cond_1
				 /* .line 4 */
				 e.b.a.y.z.g.e .c ( p1,p2,p3 );
				 /* :try_end_0 */
				 /* .catch Ljava/lang/NoClassDefFoundError; {:try_start_0 ..:try_end_0} :catch_2 */
				 /* .catch Ljava/lang/IllegalStateException; {:try_start_0 ..:try_end_0} :catch_1 */
				 /* .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
				 /* :catch_0 */
				 /* nop */
				 /* :catch_1 */
				 /* move-exception p3 */
				 /* .line 5 */
				 (( android.content.Context ) p0 ).getPackageName ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
				 (( android.content.Context ) p1 ).getPackageName ( ); // invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
				 p0 = 				 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
				 /* if-nez p0, :cond_0 */
				 /* .line 6 */
				 c.h.f.f .c ( p1,p2 );
				 /* .line 7 */
			 } // :cond_0
			 /* throw p3 */
			 /* :catch_2 */
			 int p0 = 0; // const/4 p0, 0x0
			 /* .line 8 */
			 e.b.a.y.z.g.e.a = (p0!= 0);
		 } // :cond_1
	 } // :goto_0
	 if ( p3 != null) { // if-eqz p3, :cond_2
		 /* .line 9 */
	 } // :cond_2
	 (( android.content.Context ) p1 ).getTheme ( ); // invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;
} // :goto_1
e.b.a.y.z.g.e .b ( p1,p2,p3 );
} // .end method
public static android.graphics.drawable.Drawable b ( android.content.Context p0, Integer p1, android.content.res.Resources$Theme p2 ) {
/* .locals 0 */
/* .line 1 */
(( android.content.Context ) p0 ).getResources ( ); // invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
c.h.f.i.s .c ( p0,p1,p2 );
} // .end method
public static android.graphics.drawable.Drawable c ( android.content.Context p0, Integer p1, android.content.res.Resources$Theme p2 ) {
/* .locals 2 */
if ( p2 != null) { // if-eqz p2, :cond_0
	 /* .line 1 */
	 /* const/16 v1, 0x15 */
	 /* if-lt v0, v1, :cond_0 */
	 /* .line 2 */
	 /* new-instance v0, Lc/b/p/e; */
	 /* invoke-direct {v0, p0, p2}, Lc/b/p/e;-><init>(Landroid/content/Context;Landroid/content/res/Resources$Theme;)V */
	 /* .line 3 */
	 (( android.content.res.Resources$Theme ) p2 ).getResources ( ); // invoke-virtual {p2}, Landroid/content/res/Resources$Theme;->getResources()Landroid/content/res/Resources;
	 (( android.content.res.Resources ) p0 ).getConfiguration ( ); // invoke-virtual {p0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;
	 (( c.b.p.e ) v0 ).a ( p0 ); // invoke-virtual {v0, p0}, Lc/b/p/e;->a(Landroid/content/res/Configuration;)V
	 /* move-object p0, v0 */
	 /* .line 4 */
} // :cond_0
c.b.l.a.b .c ( p0,p1 );
} // .end method
