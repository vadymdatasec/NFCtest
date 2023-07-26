public class c.h.g.l extends c.h.g.p {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public c.h.g.l ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Lc/h/g/p;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public android.graphics.Typeface a ( android.content.Context p0, android.content.res.Resources p1, Integer p2, java.lang.String p3, Integer p4 ) {
		 /* .locals 0 */
		 /* .line 34 */
		 try { // :try_start_0
			 /* new-instance p1, Landroid/graphics/fonts/Font$Builder; */
			 /* invoke-direct {p1, p2, p3}, Landroid/graphics/fonts/Font$Builder;-><init>(Landroid/content/res/Resources;I)V */
			 (( android.graphics.fonts.Font$Builder ) p1 ).build ( ); // invoke-virtual {p1}, Landroid/graphics/fonts/Font$Builder;->build()Landroid/graphics/fonts/Font;
			 /* .line 35 */
			 /* new-instance p2, Landroid/graphics/fonts/FontFamily$Builder; */
			 /* invoke-direct {p2, p1}, Landroid/graphics/fonts/FontFamily$Builder;-><init>(Landroid/graphics/fonts/Font;)V */
			 (( android.graphics.fonts.FontFamily$Builder ) p2 ).build ( ); // invoke-virtual {p2}, Landroid/graphics/fonts/FontFamily$Builder;->build()Landroid/graphics/fonts/FontFamily;
			 /* .line 36 */
			 /* new-instance p3, Landroid/graphics/Typeface$CustomFallbackBuilder; */
			 /* invoke-direct {p3, p2}, Landroid/graphics/Typeface$CustomFallbackBuilder;-><init>(Landroid/graphics/fonts/FontFamily;)V */
			 /* .line 37 */
			 (( android.graphics.fonts.Font ) p1 ).getStyle ( ); // invoke-virtual {p1}, Landroid/graphics/fonts/Font;->getStyle()Landroid/graphics/fonts/FontStyle;
			 (( android.graphics.Typeface$CustomFallbackBuilder ) p3 ).setStyle ( p1 ); // invoke-virtual {p3, p1}, Landroid/graphics/Typeface$CustomFallbackBuilder;->setStyle(Landroid/graphics/fonts/FontStyle;)Landroid/graphics/Typeface$CustomFallbackBuilder;
			 /* .line 38 */
			 (( android.graphics.Typeface$CustomFallbackBuilder ) p1 ).build ( ); // invoke-virtual {p1}, Landroid/graphics/Typeface$CustomFallbackBuilder;->build()Landroid/graphics/Typeface;
			 /* :try_end_0 */
			 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* :catch_0 */
			 int p1 = 0; // const/4 p1, 0x0
		 } // .end method
		 public android.graphics.Typeface a ( android.content.Context p0, android.os.CancellationSignal p1, Object[] p2, Integer p3 ) {
			 /* .locals 10 */
			 /* .line 3 */
			 (( android.content.Context ) p1 ).getContentResolver ( ); // invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;
			 int v0 = 0; // const/4 v0, 0x0
			 /* .line 4 */
			 try { // :try_start_0
				 /* array-length v1, p3 */
				 int v2 = 0; // const/4 v2, 0x0
				 /* move-object v4, v0 */
				 int v3 = 0; // const/4 v3, 0x0
			 } // :goto_0
			 int v5 = 1; // const/4 v5, 0x1
			 /* if-ge v3, v1, :cond_5 */
			 /* aget-object v6, p3, v3 */
			 /* :try_end_0 */
			 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_1 */
			 /* .line 5 */
			 try { // :try_start_1
				 (( c.h.k.o ) v6 ).c ( ); // invoke-virtual {v6}, Lc/h/k/o;->c()Landroid/net/Uri;
				 final String v8 = "r"; // const-string v8, "r"
				 (( android.content.ContentResolver ) p1 ).openFileDescriptor ( v7, v8, p2 ); // invoke-virtual {p1, v7, v8, p2}, Landroid/content/ContentResolver;->openFileDescriptor(Landroid/net/Uri;Ljava/lang/String;Landroid/os/CancellationSignal;)Landroid/os/ParcelFileDescriptor;
				 /* if-nez v7, :cond_0 */
				 if ( v7 != null) { // if-eqz v7, :cond_4
					 /* .line 6 */
				 } // :goto_1
				 (( android.os.ParcelFileDescriptor ) v7 ).close ( ); // invoke-virtual {v7}, Landroid/os/ParcelFileDescriptor;->close()V
				 /* :try_end_1 */
				 /* .catch Ljava/io/IOException; {:try_start_1 ..:try_end_1} :catch_0 */
				 /* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_1 */
				 /* .line 7 */
			 } // :cond_0
			 try { // :try_start_2
				 /* new-instance v8, Landroid/graphics/fonts/Font$Builder; */
				 /* invoke-direct {v8, v7}, Landroid/graphics/fonts/Font$Builder;-><init>(Landroid/os/ParcelFileDescriptor;)V */
				 /* .line 8 */
				 v9 = 				 (( c.h.k.o ) v6 ).d ( ); // invoke-virtual {v6}, Lc/h/k/o;->d()I
				 (( android.graphics.fonts.Font$Builder ) v8 ).setWeight ( v9 ); // invoke-virtual {v8, v9}, Landroid/graphics/fonts/Font$Builder;->setWeight(I)Landroid/graphics/fonts/Font$Builder;
				 /* .line 9 */
				 v9 = 				 (( c.h.k.o ) v6 ).e ( ); // invoke-virtual {v6}, Lc/h/k/o;->e()Z
				 if ( v9 != null) { // if-eqz v9, :cond_1
				 } // :cond_1
				 int v5 = 0; // const/4 v5, 0x0
			 } // :goto_2
			 (( android.graphics.fonts.Font$Builder ) v8 ).setSlant ( v5 ); // invoke-virtual {v8, v5}, Landroid/graphics/fonts/Font$Builder;->setSlant(I)Landroid/graphics/fonts/Font$Builder;
			 /* .line 10 */
			 v6 = 			 (( c.h.k.o ) v6 ).b ( ); // invoke-virtual {v6}, Lc/h/k/o;->b()I
			 (( android.graphics.fonts.Font$Builder ) v5 ).setTtcIndex ( v6 ); // invoke-virtual {v5, v6}, Landroid/graphics/fonts/Font$Builder;->setTtcIndex(I)Landroid/graphics/fonts/Font$Builder;
			 /* .line 11 */
			 (( android.graphics.fonts.Font$Builder ) v5 ).build ( ); // invoke-virtual {v5}, Landroid/graphics/fonts/Font$Builder;->build()Landroid/graphics/fonts/Font;
			 /* if-nez v4, :cond_2 */
			 /* .line 12 */
			 /* new-instance v6, Landroid/graphics/fonts/FontFamily$Builder; */
			 /* invoke-direct {v6, v5}, Landroid/graphics/fonts/FontFamily$Builder;-><init>(Landroid/graphics/fonts/Font;)V */
			 /* move-object v4, v6 */
			 /* .line 13 */
		 } // :cond_2
		 (( android.graphics.fonts.FontFamily$Builder ) v4 ).addFont ( v5 ); // invoke-virtual {v4, v5}, Landroid/graphics/fonts/FontFamily$Builder;->addFont(Landroid/graphics/fonts/Font;)Landroid/graphics/fonts/FontFamily$Builder;
		 /* :try_end_2 */
		 /* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
	 } // :goto_3
	 if ( v7 != null) { // if-eqz v7, :cond_4
		 /* :catchall_0 */
		 /* move-exception v5 */
		 if ( v7 != null) { // if-eqz v7, :cond_3
			 /* .line 14 */
			 try { // :try_start_3
				 (( android.os.ParcelFileDescriptor ) v7 ).close ( ); // invoke-virtual {v7}, Landroid/os/ParcelFileDescriptor;->close()V
				 /* :try_end_3 */
				 /* .catchall {:try_start_3 ..:try_end_3} :catchall_1 */
				 /* :catchall_1 */
				 /* move-exception v6 */
				 try { // :try_start_4
					 (( java.lang.Throwable ) v5 ).addSuppressed ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V
				 } // :cond_3
			 } // :goto_4
			 /* throw v5 */
			 /* :try_end_4 */
			 /* .catch Ljava/io/IOException; {:try_start_4 ..:try_end_4} :catch_0 */
			 /* .catch Ljava/lang/Exception; {:try_start_4 ..:try_end_4} :catch_1 */
			 /* :catch_0 */
		 } // :cond_4
	 } // :goto_5
	 /* add-int/lit8 v3, v3, 0x1 */
} // :cond_5
/* if-nez v4, :cond_6 */
/* .line 15 */
} // :cond_6
try { // :try_start_5
/* new-instance p1, Landroid/graphics/fonts/FontStyle; */
/* and-int/lit8 p2, p4, 0x1 */
if ( p2 != null) { // if-eqz p2, :cond_7
	 /* const/16 p2, 0x2bc */
} // :cond_7
/* const/16 p2, 0x190 */
} // :goto_6
/* and-int/lit8 p3, p4, 0x2 */
if ( p3 != null) { // if-eqz p3, :cond_8
int v2 = 1; // const/4 v2, 0x1
/* .line 16 */
} // :cond_8
/* invoke-direct {p1, p2, v2}, Landroid/graphics/fonts/FontStyle;-><init>(II)V */
/* .line 17 */
/* new-instance p2, Landroid/graphics/Typeface$CustomFallbackBuilder; */
(( android.graphics.fonts.FontFamily$Builder ) v4 ).build ( ); // invoke-virtual {v4}, Landroid/graphics/fonts/FontFamily$Builder;->build()Landroid/graphics/fonts/FontFamily;
/* invoke-direct {p2, p3}, Landroid/graphics/Typeface$CustomFallbackBuilder;-><init>(Landroid/graphics/fonts/FontFamily;)V */
/* .line 18 */
(( android.graphics.Typeface$CustomFallbackBuilder ) p2 ).setStyle ( p1 ); // invoke-virtual {p2, p1}, Landroid/graphics/Typeface$CustomFallbackBuilder;->setStyle(Landroid/graphics/fonts/FontStyle;)Landroid/graphics/Typeface$CustomFallbackBuilder;
/* .line 19 */
(( android.graphics.Typeface$CustomFallbackBuilder ) p1 ).build ( ); // invoke-virtual {p1}, Landroid/graphics/Typeface$CustomFallbackBuilder;->build()Landroid/graphics/Typeface;
/* :try_end_5 */
/* .catch Ljava/lang/Exception; {:try_start_5 ..:try_end_5} :catch_1 */
/* :catch_1 */
} // .end method
public android.graphics.Typeface a ( android.content.Context p0, Object p1, android.content.res.Resources p2, Integer p3 ) {
/* .locals 8 */
int p1 = 0; // const/4 p1, 0x0
/* .line 20 */
try { // :try_start_0
(( c.h.f.i.f ) p2 ).a ( ); // invoke-virtual {p2}, Lc/h/f/i/f;->a()[Lc/h/f/i/g;
/* array-length v0, p2 */
int v1 = 0; // const/4 v1, 0x0
/* move-object v3, p1 */
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
int v4 = 1; // const/4 v4, 0x1
/* if-ge v2, v0, :cond_2 */
/* aget-object v5, p2, v2 */
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_1 */
/* .line 21 */
try { // :try_start_1
/* new-instance v6, Landroid/graphics/fonts/Font$Builder; */
v7 = (( c.h.f.i.g ) v5 ).b ( ); // invoke-virtual {v5}, Lc/h/f/i/g;->b()I
/* invoke-direct {v6, p3, v7}, Landroid/graphics/fonts/Font$Builder;-><init>(Landroid/content/res/Resources;I)V */
/* .line 22 */
v7 = (( c.h.f.i.g ) v5 ).e ( ); // invoke-virtual {v5}, Lc/h/f/i/g;->e()I
(( android.graphics.fonts.Font$Builder ) v6 ).setWeight ( v7 ); // invoke-virtual {v6, v7}, Landroid/graphics/fonts/Font$Builder;->setWeight(I)Landroid/graphics/fonts/Font$Builder;
/* .line 23 */
v7 = (( c.h.f.i.g ) v5 ).f ( ); // invoke-virtual {v5}, Lc/h/f/i/g;->f()Z
if ( v7 != null) { // if-eqz v7, :cond_0
} // :cond_0
int v4 = 0; // const/4 v4, 0x0
} // :goto_1
(( android.graphics.fonts.Font$Builder ) v6 ).setSlant ( v4 ); // invoke-virtual {v6, v4}, Landroid/graphics/fonts/Font$Builder;->setSlant(I)Landroid/graphics/fonts/Font$Builder;
/* .line 24 */
v6 = (( c.h.f.i.g ) v5 ).c ( ); // invoke-virtual {v5}, Lc/h/f/i/g;->c()I
(( android.graphics.fonts.Font$Builder ) v4 ).setTtcIndex ( v6 ); // invoke-virtual {v4, v6}, Landroid/graphics/fonts/Font$Builder;->setTtcIndex(I)Landroid/graphics/fonts/Font$Builder;
/* .line 25 */
(( c.h.f.i.g ) v5 ).d ( ); // invoke-virtual {v5}, Lc/h/f/i/g;->d()Ljava/lang/String;
(( android.graphics.fonts.Font$Builder ) v4 ).setFontVariationSettings ( v5 ); // invoke-virtual {v4, v5}, Landroid/graphics/fonts/Font$Builder;->setFontVariationSettings(Ljava/lang/String;)Landroid/graphics/fonts/Font$Builder;
/* .line 26 */
(( android.graphics.fonts.Font$Builder ) v4 ).build ( ); // invoke-virtual {v4}, Landroid/graphics/fonts/Font$Builder;->build()Landroid/graphics/fonts/Font;
/* if-nez v3, :cond_1 */
/* .line 27 */
/* new-instance v5, Landroid/graphics/fonts/FontFamily$Builder; */
/* invoke-direct {v5, v4}, Landroid/graphics/fonts/FontFamily$Builder;-><init>(Landroid/graphics/fonts/Font;)V */
/* move-object v3, v5 */
/* .line 28 */
} // :cond_1
(( android.graphics.fonts.FontFamily$Builder ) v3 ).addFont ( v4 ); // invoke-virtual {v3, v4}, Landroid/graphics/fonts/FontFamily$Builder;->addFont(Landroid/graphics/fonts/Font;)Landroid/graphics/fonts/FontFamily$Builder;
/* :try_end_1 */
/* .catch Ljava/io/IOException; {:try_start_1 ..:try_end_1} :catch_0 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_1 */
/* :catch_0 */
} // :goto_2
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_2
/* if-nez v3, :cond_3 */
/* .line 29 */
} // :cond_3
try { // :try_start_2
/* new-instance p2, Landroid/graphics/fonts/FontStyle; */
/* and-int/lit8 p3, p4, 0x1 */
if ( p3 != null) { // if-eqz p3, :cond_4
/* const/16 p3, 0x2bc */
} // :cond_4
/* const/16 p3, 0x190 */
} // :goto_3
/* and-int/lit8 p4, p4, 0x2 */
if ( p4 != null) { // if-eqz p4, :cond_5
int v1 = 1; // const/4 v1, 0x1
/* .line 30 */
} // :cond_5
/* invoke-direct {p2, p3, v1}, Landroid/graphics/fonts/FontStyle;-><init>(II)V */
/* .line 31 */
/* new-instance p3, Landroid/graphics/Typeface$CustomFallbackBuilder; */
(( android.graphics.fonts.FontFamily$Builder ) v3 ).build ( ); // invoke-virtual {v3}, Landroid/graphics/fonts/FontFamily$Builder;->build()Landroid/graphics/fonts/FontFamily;
/* invoke-direct {p3, p4}, Landroid/graphics/Typeface$CustomFallbackBuilder;-><init>(Landroid/graphics/fonts/FontFamily;)V */
/* .line 32 */
(( android.graphics.Typeface$CustomFallbackBuilder ) p3 ).setStyle ( p2 ); // invoke-virtual {p3, p2}, Landroid/graphics/Typeface$CustomFallbackBuilder;->setStyle(Landroid/graphics/fonts/FontStyle;)Landroid/graphics/Typeface$CustomFallbackBuilder;
/* .line 33 */
(( android.graphics.Typeface$CustomFallbackBuilder ) p2 ).build ( ); // invoke-virtual {p2}, Landroid/graphics/Typeface$CustomFallbackBuilder;->build()Landroid/graphics/Typeface;
/* :try_end_2 */
/* .catch Ljava/lang/Exception; {:try_start_2 ..:try_end_2} :catch_1 */
/* :catch_1 */
} // .end method
public android.graphics.Typeface a ( android.content.Context p0, java.io.InputStream p1 ) {
/* .locals 0 */
/* .line 2 */
/* new-instance p1, Ljava/lang/RuntimeException; */
final String p2 = "Do not use this function in API 29 or later."; // const-string p2, "Do not use this function in API 29 or later."
/* invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
public c.h.k.o a ( Object[] p0, Integer p1 ) {
/* .locals 0 */
/* .line 1 */
/* new-instance p1, Ljava/lang/RuntimeException; */
final String p2 = "Do not use this function in API 29 or later."; // const-string p2, "Do not use this function in API 29 or later."
/* invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
