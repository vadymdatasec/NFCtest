public abstract class e.b.a.q {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static com.bumptech.glide.Registry a ( Object p0, java.util.List p1, Object p2 ) {
		 /* .locals 5 */
		 /* .annotation system Ldalvik/annotation/Signature; */
		 /* value = { */
		 /* "(", */
		 /* "Le/b/a/d;", */
		 /* "Ljava/util/List<", */
		 /* "Le/b/a/a0/c;", */
		 /* ">;", */
		 /* "Le/b/a/a0/a;", */
		 /* ")", */
		 /* "Lcom/bumptech/glide/Registry;" */
		 /* } */
	 } // .end annotation
	 /* .line 1 */
	 (( e.b.a.d ) p0 ).c ( ); // invoke-virtual {p0}, Le/b/a/d;->c()Le/b/a/y/x/f1/g;
	 /* .line 2 */
	 (( e.b.a.d ) p0 ).b ( ); // invoke-virtual {p0}, Le/b/a/d;->b()Le/b/a/y/x/f1/b;
	 /* .line 3 */
	 (( e.b.a.d ) p0 ).f ( ); // invoke-virtual {p0}, Le/b/a/d;->f()Le/b/a/j;
	 (( android.content.ContextWrapper ) v2 ).getApplicationContext ( ); // invoke-virtual {v2}, Landroid/content/ContextWrapper;->getApplicationContext()Landroid/content/Context;
	 /* .line 4 */
	 (( e.b.a.d ) p0 ).f ( ); // invoke-virtual {p0}, Le/b/a/d;->f()Le/b/a/j;
	 (( e.b.a.j ) v3 ).e ( ); // invoke-virtual {v3}, Le/b/a/j;->e()Le/b/a/l;
	 /* .line 5 */
	 /* new-instance v4, Lcom/bumptech/glide/Registry; */
	 /* invoke-direct {v4}, Lcom/bumptech/glide/Registry;-><init>()V */
	 /* .line 6 */
	 e.b.a.q .a ( v2,v4,v0,v1,v3 );
	 /* .line 7 */
	 e.b.a.q .a ( v2,p0,v4,p1,p2 );
} // .end method
public static void a ( android.content.Context p0, com.bumptech.glide.Registry p1, Object p2, Object p3, Object p4 ) {
	 /* .locals 23 */
	 /* move-object/from16 v0, p0 */
	 /* move-object/from16 v1, p1 */
	 /* move-object/from16 v2, p2 */
	 /* move-object/from16 v3, p3 */
	 /* .line 8 */
	 /* const-class v4, Le/b/a/x/b; */
	 /* const-class v5, Ljava/lang/String; */
	 /* const-class v6, [B */
	 /* const-class v7, Ljava/lang/Integer; */
	 /* new-instance v8, Lcom/bumptech/glide/load/resource/bitmap/DefaultImageHeaderParser; */
	 /* invoke-direct {v8}, Lcom/bumptech/glide/load/resource/bitmap/DefaultImageHeaderParser;-><init>()V */
	 (( com.bumptech.glide.Registry ) v1 ).a ( v8 ); // invoke-virtual {v1, v8}, Lcom/bumptech/glide/Registry;->a(Lcom/bumptech/glide/load/ImageHeaderParser;)Lcom/bumptech/glide/Registry;
	 /* .line 9 */
	 /* const/16 v9, 0x1b */
	 /* if-lt v8, v9, :cond_0 */
	 /* .line 10 */
	 /* new-instance v8, Le/b/a/y/z/e/b0; */
	 /* invoke-direct {v8}, Le/b/a/y/z/e/b0;-><init>()V */
	 (( com.bumptech.glide.Registry ) v1 ).a ( v8 ); // invoke-virtual {v1, v8}, Lcom/bumptech/glide/Registry;->a(Lcom/bumptech/glide/load/ImageHeaderParser;)Lcom/bumptech/glide/Registry;
	 /* .line 11 */
} // :cond_0
/* invoke-virtual/range {p0 ..p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources; */
/* .line 12 */
/* invoke-virtual/range {p1 ..p1}, Lcom/bumptech/glide/Registry;->a()Ljava/util/List; */
/* .line 13 */
/* new-instance v10, Le/b/a/y/z/i/c; */
/* invoke-direct {v10, v0, v9, v2, v3}, Le/b/a/y/z/i/c;-><init>(Landroid/content/Context;Ljava/util/List;Le/b/a/y/x/f1/g;Le/b/a/y/x/f1/b;)V */
/* .line 14 */
/* invoke-static/range {p2 ..p2}, Le/b/a/y/z/e/d1;->c(Le/b/a/y/x/f1/g;)Le/b/a/y/t; */
/* .line 15 */
/* new-instance v12, Le/b/a/y/z/e/x; */
/* .line 16 */
/* invoke-virtual/range {p1 ..p1}, Lcom/bumptech/glide/Registry;->a()Ljava/util/List; */
(( android.content.res.Resources ) v8 ).getDisplayMetrics ( ); // invoke-virtual {v8}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
/* invoke-direct {v12, v13, v14, v2, v3}, Le/b/a/y/z/e/x;-><init>(Ljava/util/List;Landroid/util/DisplayMetrics;Le/b/a/y/x/f1/g;Le/b/a/y/x/f1/b;)V */
/* .line 17 */
/* const/16 v14, 0x1c */
/* if-lt v13, v14, :cond_1 */
/* const-class v13, Le/b/a/f; */
/* move-object/from16 v15, p4 */
/* .line 18 */
v13 = (( e.b.a.l ) v15 ).a ( v13 ); // invoke-virtual {v15, v13}, Le/b/a/l;->a(Ljava/lang/Class;)Z
if ( v13 != null) { // if-eqz v13, :cond_1
	 /* .line 19 */
	 /* new-instance v13, Le/b/a/y/z/e/i0; */
	 /* invoke-direct {v13}, Le/b/a/y/z/e/i0;-><init>()V */
	 /* .line 20 */
	 /* new-instance v15, Le/b/a/y/z/e/h; */
	 /* invoke-direct {v15}, Le/b/a/y/z/e/h;-><init>()V */
	 /* .line 21 */
} // :cond_1
/* new-instance v15, Le/b/a/y/z/e/g; */
/* invoke-direct {v15, v12}, Le/b/a/y/z/e/g;-><init>(Le/b/a/y/z/e/x;)V */
/* .line 22 */
/* new-instance v13, Le/b/a/y/z/e/p0; */
/* invoke-direct {v13, v12, v3}, Le/b/a/y/z/e/p0;-><init>(Le/b/a/y/z/e/x;Le/b/a/y/x/f1/b;)V */
} // :goto_0
/* move-object/from16 v16, v6 */
/* .line 23 */
/* move-object/from16 v17, v5 */
final String v5 = "Animation"; // const-string v5, "Animation"
/* if-lt v6, v14, :cond_2 */
/* .line 24 */
/* const-class v6, Ljava/io/InputStream; */
/* const-class v14, Landroid/graphics/drawable/Drawable; */
/* move-object/from16 v18, v7 */
/* .line 25 */
e.b.a.y.z.g.d .b ( v9,v3 );
/* .line 26 */
(( com.bumptech.glide.Registry ) v1 ).a ( v5, v6, v14, v7 ); // invoke-virtual {v1, v5, v6, v14, v7}, Lcom/bumptech/glide/Registry;->a(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Le/b/a/y/t;)Lcom/bumptech/glide/Registry;
/* .line 27 */
/* const-class v6, Ljava/nio/ByteBuffer; */
/* const-class v7, Landroid/graphics/drawable/Drawable; */
/* .line 28 */
e.b.a.y.z.g.d .a ( v9,v3 );
/* .line 29 */
(( com.bumptech.glide.Registry ) v1 ).a ( v5, v6, v7, v14 ); // invoke-virtual {v1, v5, v6, v7, v14}, Lcom/bumptech/glide/Registry;->a(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Le/b/a/y/t;)Lcom/bumptech/glide/Registry;
} // :cond_2
/* move-object/from16 v18, v7 */
/* .line 30 */
} // :goto_1
/* new-instance v6, Le/b/a/y/z/g/h; */
/* invoke-direct {v6, v0}, Le/b/a/y/z/g/h;-><init>(Landroid/content/Context;)V */
/* .line 31 */
/* new-instance v7, Le/b/a/y/z/e/c; */
/* invoke-direct {v7, v3}, Le/b/a/y/z/e/c;-><init>(Le/b/a/y/x/f1/b;)V */
/* .line 32 */
/* new-instance v14, Le/b/a/y/z/j/a; */
/* invoke-direct {v14}, Le/b/a/y/z/j/a;-><init>()V */
/* move-object/from16 p4, v14 */
/* .line 33 */
/* new-instance v14, Le/b/a/y/z/j/d; */
/* invoke-direct {v14}, Le/b/a/y/z/j/d;-><init>()V */
/* move-object/from16 v19, v14 */
/* .line 34 */
/* invoke-virtual/range {p0 ..p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver; */
/* move-object/from16 v20, v14 */
/* .line 35 */
/* const-class v14, Ljava/nio/ByteBuffer; */
/* new-instance v0, Le/b/a/y/y/l; */
/* invoke-direct {v0}, Le/b/a/y/y/l;-><init>()V */
/* .line 36 */
(( com.bumptech.glide.Registry ) v1 ).a ( v14, v0 ); // invoke-virtual {v1, v14, v0}, Lcom/bumptech/glide/Registry;->a(Ljava/lang/Class;Le/b/a/y/d;)Lcom/bumptech/glide/Registry;
/* const-class v0, Ljava/io/InputStream; */
/* new-instance v14, Le/b/a/y/y/o1; */
/* invoke-direct {v14, v3}, Le/b/a/y/y/o1;-><init>(Le/b/a/y/x/f1/b;)V */
/* .line 37 */
(( com.bumptech.glide.Registry ) v1 ).a ( v0, v14 ); // invoke-virtual {v1, v0, v14}, Lcom/bumptech/glide/Registry;->a(Ljava/lang/Class;Le/b/a/y/d;)Lcom/bumptech/glide/Registry;
/* const-class v0, Ljava/nio/ByteBuffer; */
/* const-class v14, Landroid/graphics/Bitmap; */
/* move-object/from16 v21, v6 */
final String v6 = "Bitmap"; // const-string v6, "Bitmap"
/* .line 38 */
(( com.bumptech.glide.Registry ) v1 ).a ( v6, v0, v14, v15 ); // invoke-virtual {v1, v6, v0, v14, v15}, Lcom/bumptech/glide/Registry;->a(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Le/b/a/y/t;)Lcom/bumptech/glide/Registry;
/* const-class v0, Ljava/io/InputStream; */
/* const-class v14, Landroid/graphics/Bitmap; */
/* .line 39 */
(( com.bumptech.glide.Registry ) v1 ).a ( v6, v0, v14, v13 ); // invoke-virtual {v1, v6, v0, v14, v13}, Lcom/bumptech/glide/Registry;->a(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Le/b/a/y/t;)Lcom/bumptech/glide/Registry;
/* .line 40 */
v0 = com.bumptech.glide.load.data.ParcelFileDescriptorRewinder .c ( );
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 41 */
/* const-class v0, Landroid/os/ParcelFileDescriptor; */
/* const-class v14, Landroid/graphics/Bitmap; */
/* move-object/from16 v22, v4 */
/* new-instance v4, Le/b/a/y/z/e/k0; */
/* invoke-direct {v4, v12}, Le/b/a/y/z/e/k0;-><init>(Le/b/a/y/z/e/x;)V */
(( com.bumptech.glide.Registry ) v1 ).a ( v6, v0, v14, v4 ); // invoke-virtual {v1, v6, v0, v14, v4}, Lcom/bumptech/glide/Registry;->a(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Le/b/a/y/t;)Lcom/bumptech/glide/Registry;
} // :cond_3
/* move-object/from16 v22, v4 */
/* .line 42 */
} // :goto_2
/* const-class v0, Landroid/os/ParcelFileDescriptor; */
/* const-class v4, Landroid/graphics/Bitmap; */
/* .line 43 */
(( com.bumptech.glide.Registry ) v1 ).a ( v6, v0, v4, v11 ); // invoke-virtual {v1, v6, v0, v4, v11}, Lcom/bumptech/glide/Registry;->a(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Le/b/a/y/t;)Lcom/bumptech/glide/Registry;
/* const-class v0, Landroid/content/res/AssetFileDescriptor; */
/* const-class v4, Landroid/graphics/Bitmap; */
/* .line 44 */
/* invoke-static/range {p2 ..p2}, Le/b/a/y/z/e/d1;->a(Le/b/a/y/x/f1/g;)Le/b/a/y/t; */
/* .line 45 */
(( com.bumptech.glide.Registry ) v1 ).a ( v6, v0, v4, v12 ); // invoke-virtual {v1, v6, v0, v4, v12}, Lcom/bumptech/glide/Registry;->a(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Le/b/a/y/t;)Lcom/bumptech/glide/Registry;
/* const-class v0, Landroid/graphics/Bitmap; */
/* const-class v4, Landroid/graphics/Bitmap; */
/* .line 46 */
e.b.a.y.y.t1 .a ( );
(( com.bumptech.glide.Registry ) v1 ).a ( v0, v4, v12 ); // invoke-virtual {v1, v0, v4, v12}, Lcom/bumptech/glide/Registry;->a(Ljava/lang/Class;Ljava/lang/Class;Le/b/a/y/y/x0;)Lcom/bumptech/glide/Registry;
/* const-class v0, Landroid/graphics/Bitmap; */
/* const-class v4, Landroid/graphics/Bitmap; */
/* new-instance v12, Le/b/a/y/z/e/t0; */
/* invoke-direct {v12}, Le/b/a/y/z/e/t0;-><init>()V */
/* .line 47 */
(( com.bumptech.glide.Registry ) v1 ).a ( v6, v0, v4, v12 ); // invoke-virtual {v1, v6, v0, v4, v12}, Lcom/bumptech/glide/Registry;->a(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Le/b/a/y/t;)Lcom/bumptech/glide/Registry;
/* const-class v0, Landroid/graphics/Bitmap; */
/* .line 48 */
(( com.bumptech.glide.Registry ) v1 ).a ( v0, v7 ); // invoke-virtual {v1, v0, v7}, Lcom/bumptech/glide/Registry;->a(Ljava/lang/Class;Le/b/a/y/u;)Lcom/bumptech/glide/Registry;
/* const-class v0, Ljava/nio/ByteBuffer; */
/* const-class v4, Landroid/graphics/drawable/BitmapDrawable; */
/* new-instance v12, Le/b/a/y/z/e/a; */
/* invoke-direct {v12, v8, v15}, Le/b/a/y/z/e/a;-><init>(Landroid/content/res/Resources;Le/b/a/y/t;)V */
final String v14 = "BitmapDrawable"; // const-string v14, "BitmapDrawable"
/* .line 49 */
(( com.bumptech.glide.Registry ) v1 ).a ( v14, v0, v4, v12 ); // invoke-virtual {v1, v14, v0, v4, v12}, Lcom/bumptech/glide/Registry;->a(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Le/b/a/y/t;)Lcom/bumptech/glide/Registry;
/* const-class v0, Ljava/io/InputStream; */
/* const-class v4, Landroid/graphics/drawable/BitmapDrawable; */
/* new-instance v12, Le/b/a/y/z/e/a; */
/* invoke-direct {v12, v8, v13}, Le/b/a/y/z/e/a;-><init>(Landroid/content/res/Resources;Le/b/a/y/t;)V */
/* .line 50 */
(( com.bumptech.glide.Registry ) v1 ).a ( v14, v0, v4, v12 ); // invoke-virtual {v1, v14, v0, v4, v12}, Lcom/bumptech/glide/Registry;->a(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Le/b/a/y/t;)Lcom/bumptech/glide/Registry;
/* const-class v0, Landroid/os/ParcelFileDescriptor; */
/* const-class v4, Landroid/graphics/drawable/BitmapDrawable; */
/* new-instance v12, Le/b/a/y/z/e/a; */
/* invoke-direct {v12, v8, v11}, Le/b/a/y/z/e/a;-><init>(Landroid/content/res/Resources;Le/b/a/y/t;)V */
/* .line 51 */
(( com.bumptech.glide.Registry ) v1 ).a ( v14, v0, v4, v12 ); // invoke-virtual {v1, v14, v0, v4, v12}, Lcom/bumptech/glide/Registry;->a(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Le/b/a/y/t;)Lcom/bumptech/glide/Registry;
/* const-class v0, Landroid/graphics/drawable/BitmapDrawable; */
/* new-instance v4, Le/b/a/y/z/e/b; */
/* invoke-direct {v4, v2, v7}, Le/b/a/y/z/e/b;-><init>(Le/b/a/y/x/f1/g;Le/b/a/y/u;)V */
/* .line 52 */
(( com.bumptech.glide.Registry ) v1 ).a ( v0, v4 ); // invoke-virtual {v1, v0, v4}, Lcom/bumptech/glide/Registry;->a(Ljava/lang/Class;Le/b/a/y/u;)Lcom/bumptech/glide/Registry;
/* const-class v0, Ljava/io/InputStream; */
/* const-class v4, Le/b/a/y/z/i/f; */
/* new-instance v7, Le/b/a/y/z/i/q; */
/* invoke-direct {v7, v9, v10, v3}, Le/b/a/y/z/i/q;-><init>(Ljava/util/List;Le/b/a/y/t;Le/b/a/y/x/f1/b;)V */
/* .line 53 */
(( com.bumptech.glide.Registry ) v1 ).a ( v5, v0, v4, v7 ); // invoke-virtual {v1, v5, v0, v4, v7}, Lcom/bumptech/glide/Registry;->a(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Le/b/a/y/t;)Lcom/bumptech/glide/Registry;
/* const-class v0, Ljava/nio/ByteBuffer; */
/* const-class v4, Le/b/a/y/z/i/f; */
/* .line 54 */
(( com.bumptech.glide.Registry ) v1 ).a ( v5, v0, v4, v10 ); // invoke-virtual {v1, v5, v0, v4, v10}, Lcom/bumptech/glide/Registry;->a(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Le/b/a/y/t;)Lcom/bumptech/glide/Registry;
/* const-class v0, Le/b/a/y/z/i/f; */
/* new-instance v4, Le/b/a/y/z/i/g; */
/* invoke-direct {v4}, Le/b/a/y/z/i/g;-><init>()V */
/* .line 55 */
(( com.bumptech.glide.Registry ) v1 ).a ( v0, v4 ); // invoke-virtual {v1, v0, v4}, Lcom/bumptech/glide/Registry;->a(Ljava/lang/Class;Le/b/a/y/u;)Lcom/bumptech/glide/Registry;
/* .line 56 */
e.b.a.y.y.t1 .a ( );
/* move-object/from16 v4, v22 */
/* .line 57 */
(( com.bumptech.glide.Registry ) v1 ).a ( v4, v4, v0 ); // invoke-virtual {v1, v4, v4, v0}, Lcom/bumptech/glide/Registry;->a(Ljava/lang/Class;Ljava/lang/Class;Le/b/a/y/y/x0;)Lcom/bumptech/glide/Registry;
/* const-class v0, Landroid/graphics/Bitmap; */
/* new-instance v5, Le/b/a/y/z/i/o; */
/* invoke-direct {v5, v2}, Le/b/a/y/z/i/o;-><init>(Le/b/a/y/x/f1/g;)V */
/* .line 58 */
(( com.bumptech.glide.Registry ) v1 ).a ( v6, v4, v0, v5 ); // invoke-virtual {v1, v6, v4, v0, v5}, Lcom/bumptech/glide/Registry;->a(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Le/b/a/y/t;)Lcom/bumptech/glide/Registry;
/* const-class v0, Landroid/net/Uri; */
/* const-class v4, Landroid/graphics/drawable/Drawable; */
/* move-object/from16 v5, v21 */
/* .line 59 */
(( com.bumptech.glide.Registry ) v1 ).a ( v0, v4, v5 ); // invoke-virtual {v1, v0, v4, v5}, Lcom/bumptech/glide/Registry;->a(Ljava/lang/Class;Ljava/lang/Class;Le/b/a/y/t;)Lcom/bumptech/glide/Registry;
/* const-class v0, Landroid/net/Uri; */
/* const-class v4, Landroid/graphics/Bitmap; */
/* new-instance v6, Le/b/a/y/z/e/n0; */
/* invoke-direct {v6, v5, v2}, Le/b/a/y/z/e/n0;-><init>(Le/b/a/y/z/g/h;Le/b/a/y/x/f1/g;)V */
/* .line 60 */
(( com.bumptech.glide.Registry ) v1 ).a ( v0, v4, v6 ); // invoke-virtual {v1, v0, v4, v6}, Lcom/bumptech/glide/Registry;->a(Ljava/lang/Class;Ljava/lang/Class;Le/b/a/y/t;)Lcom/bumptech/glide/Registry;
/* new-instance v0, Le/b/a/y/z/f/a; */
/* invoke-direct {v0}, Le/b/a/y/z/f/a;-><init>()V */
/* .line 61 */
(( com.bumptech.glide.Registry ) v1 ).a ( v0 ); // invoke-virtual {v1, v0}, Lcom/bumptech/glide/Registry;->a(Le/b/a/y/w/f;)Lcom/bumptech/glide/Registry;
/* const-class v0, Ljava/io/File; */
/* const-class v4, Ljava/nio/ByteBuffer; */
/* new-instance v5, Le/b/a/y/y/n; */
/* invoke-direct {v5}, Le/b/a/y/y/n;-><init>()V */
/* .line 62 */
(( com.bumptech.glide.Registry ) v1 ).a ( v0, v4, v5 ); // invoke-virtual {v1, v0, v4, v5}, Lcom/bumptech/glide/Registry;->a(Ljava/lang/Class;Ljava/lang/Class;Le/b/a/y/y/x0;)Lcom/bumptech/glide/Registry;
/* const-class v0, Ljava/io/File; */
/* const-class v4, Ljava/io/InputStream; */
/* new-instance v5, Le/b/a/y/y/g0; */
/* invoke-direct {v5}, Le/b/a/y/y/g0;-><init>()V */
/* .line 63 */
(( com.bumptech.glide.Registry ) v1 ).a ( v0, v4, v5 ); // invoke-virtual {v1, v0, v4, v5}, Lcom/bumptech/glide/Registry;->a(Ljava/lang/Class;Ljava/lang/Class;Le/b/a/y/y/x0;)Lcom/bumptech/glide/Registry;
/* const-class v0, Ljava/io/File; */
/* const-class v4, Ljava/io/File; */
/* new-instance v5, Le/b/a/y/z/h/a; */
/* invoke-direct {v5}, Le/b/a/y/z/h/a;-><init>()V */
/* .line 64 */
(( com.bumptech.glide.Registry ) v1 ).a ( v0, v4, v5 ); // invoke-virtual {v1, v0, v4, v5}, Lcom/bumptech/glide/Registry;->a(Ljava/lang/Class;Ljava/lang/Class;Le/b/a/y/t;)Lcom/bumptech/glide/Registry;
/* const-class v0, Ljava/io/File; */
/* const-class v4, Landroid/os/ParcelFileDescriptor; */
/* new-instance v5, Le/b/a/y/y/c0; */
/* invoke-direct {v5}, Le/b/a/y/y/c0;-><init>()V */
/* .line 65 */
(( com.bumptech.glide.Registry ) v1 ).a ( v0, v4, v5 ); // invoke-virtual {v1, v0, v4, v5}, Lcom/bumptech/glide/Registry;->a(Ljava/lang/Class;Ljava/lang/Class;Le/b/a/y/y/x0;)Lcom/bumptech/glide/Registry;
/* const-class v0, Ljava/io/File; */
/* const-class v4, Ljava/io/File; */
/* .line 66 */
e.b.a.y.y.t1 .a ( );
(( com.bumptech.glide.Registry ) v1 ).a ( v0, v4, v5 ); // invoke-virtual {v1, v0, v4, v5}, Lcom/bumptech/glide/Registry;->a(Ljava/lang/Class;Ljava/lang/Class;Le/b/a/y/y/x0;)Lcom/bumptech/glide/Registry;
/* new-instance v0, Le/b/a/y/w/q; */
/* invoke-direct {v0, v3}, Le/b/a/y/w/q;-><init>(Le/b/a/y/x/f1/b;)V */
/* .line 67 */
(( com.bumptech.glide.Registry ) v1 ).a ( v0 ); // invoke-virtual {v1, v0}, Lcom/bumptech/glide/Registry;->a(Le/b/a/y/w/f;)Lcom/bumptech/glide/Registry;
/* .line 68 */
v0 = com.bumptech.glide.load.data.ParcelFileDescriptorRewinder .c ( );
if ( v0 != null) { // if-eqz v0, :cond_4
/* .line 69 */
/* new-instance v0, Le/b/a/y/w/t; */
/* invoke-direct {v0}, Le/b/a/y/w/t;-><init>()V */
(( com.bumptech.glide.Registry ) v1 ).a ( v0 ); // invoke-virtual {v1, v0}, Lcom/bumptech/glide/Registry;->a(Le/b/a/y/w/f;)Lcom/bumptech/glide/Registry;
/* .line 70 */
} // :cond_4
/* invoke-static/range {p0 ..p0}, Le/b/a/y/y/z;->c(Landroid/content/Context;)Le/b/a/y/y/x0; */
/* .line 71 */
/* invoke-static/range {p0 ..p0}, Le/b/a/y/y/z;->a(Landroid/content/Context;)Le/b/a/y/y/x0; */
/* .line 72 */
/* invoke-static/range {p0 ..p0}, Le/b/a/y/y/z;->b(Landroid/content/Context;)Le/b/a/y/y/x0; */
/* .line 73 */
v5 = java.lang.Integer.TYPE;
/* const-class v6, Ljava/io/InputStream; */
/* .line 74 */
(( com.bumptech.glide.Registry ) v1 ).a ( v5, v6, v0 ); // invoke-virtual {v1, v5, v6, v0}, Lcom/bumptech/glide/Registry;->a(Ljava/lang/Class;Ljava/lang/Class;Le/b/a/y/y/x0;)Lcom/bumptech/glide/Registry;
/* const-class v5, Ljava/io/InputStream; */
/* move-object/from16 v6, v18 */
/* .line 75 */
(( com.bumptech.glide.Registry ) v1 ).a ( v6, v5, v0 ); // invoke-virtual {v1, v6, v5, v0}, Lcom/bumptech/glide/Registry;->a(Ljava/lang/Class;Ljava/lang/Class;Le/b/a/y/y/x0;)Lcom/bumptech/glide/Registry;
v0 = java.lang.Integer.TYPE;
/* const-class v5, Landroid/content/res/AssetFileDescriptor; */
/* .line 76 */
(( com.bumptech.glide.Registry ) v1 ).a ( v0, v5, v3 ); // invoke-virtual {v1, v0, v5, v3}, Lcom/bumptech/glide/Registry;->a(Ljava/lang/Class;Ljava/lang/Class;Le/b/a/y/y/x0;)Lcom/bumptech/glide/Registry;
/* const-class v0, Landroid/content/res/AssetFileDescriptor; */
/* .line 77 */
(( com.bumptech.glide.Registry ) v1 ).a ( v6, v0, v3 ); // invoke-virtual {v1, v6, v0, v3}, Lcom/bumptech/glide/Registry;->a(Ljava/lang/Class;Ljava/lang/Class;Le/b/a/y/y/x0;)Lcom/bumptech/glide/Registry;
v0 = java.lang.Integer.TYPE;
/* const-class v3, Landroid/graphics/drawable/Drawable; */
/* .line 78 */
(( com.bumptech.glide.Registry ) v1 ).a ( v0, v3, v4 ); // invoke-virtual {v1, v0, v3, v4}, Lcom/bumptech/glide/Registry;->a(Ljava/lang/Class;Ljava/lang/Class;Le/b/a/y/y/x0;)Lcom/bumptech/glide/Registry;
/* const-class v0, Landroid/graphics/drawable/Drawable; */
/* .line 79 */
(( com.bumptech.glide.Registry ) v1 ).a ( v6, v0, v4 ); // invoke-virtual {v1, v6, v0, v4}, Lcom/bumptech/glide/Registry;->a(Ljava/lang/Class;Ljava/lang/Class;Le/b/a/y/y/x0;)Lcom/bumptech/glide/Registry;
/* const-class v0, Landroid/net/Uri; */
/* const-class v3, Ljava/io/InputStream; */
/* .line 80 */
/* invoke-static/range {p0 ..p0}, Le/b/a/y/y/n1;->b(Landroid/content/Context;)Le/b/a/y/y/x0; */
(( com.bumptech.glide.Registry ) v1 ).a ( v0, v3, v4 ); // invoke-virtual {v1, v0, v3, v4}, Lcom/bumptech/glide/Registry;->a(Ljava/lang/Class;Ljava/lang/Class;Le/b/a/y/y/x0;)Lcom/bumptech/glide/Registry;
/* const-class v0, Landroid/net/Uri; */
/* const-class v3, Landroid/content/res/AssetFileDescriptor; */
/* .line 81 */
/* invoke-static/range {p0 ..p0}, Le/b/a/y/y/n1;->a(Landroid/content/Context;)Le/b/a/y/y/x0; */
/* .line 82 */
(( com.bumptech.glide.Registry ) v1 ).a ( v0, v3, v4 ); // invoke-virtual {v1, v0, v3, v4}, Lcom/bumptech/glide/Registry;->a(Ljava/lang/Class;Ljava/lang/Class;Le/b/a/y/y/x0;)Lcom/bumptech/glide/Registry;
/* .line 83 */
/* new-instance v0, Le/b/a/y/y/j1; */
/* invoke-direct {v0, v8}, Le/b/a/y/y/j1;-><init>(Landroid/content/res/Resources;)V */
/* .line 84 */
/* new-instance v3, Le/b/a/y/y/h1; */
/* invoke-direct {v3, v8}, Le/b/a/y/y/h1;-><init>(Landroid/content/res/Resources;)V */
/* .line 85 */
/* new-instance v4, Le/b/a/y/y/i1; */
/* invoke-direct {v4, v8}, Le/b/a/y/y/i1;-><init>(Landroid/content/res/Resources;)V */
/* .line 86 */
/* const-class v5, Landroid/net/Uri; */
/* .line 87 */
(( com.bumptech.glide.Registry ) v1 ).a ( v6, v5, v0 ); // invoke-virtual {v1, v6, v5, v0}, Lcom/bumptech/glide/Registry;->a(Ljava/lang/Class;Ljava/lang/Class;Le/b/a/y/y/x0;)Lcom/bumptech/glide/Registry;
v5 = java.lang.Integer.TYPE;
/* const-class v7, Landroid/net/Uri; */
/* .line 88 */
(( com.bumptech.glide.Registry ) v1 ).a ( v5, v7, v0 ); // invoke-virtual {v1, v5, v7, v0}, Lcom/bumptech/glide/Registry;->a(Ljava/lang/Class;Ljava/lang/Class;Le/b/a/y/y/x0;)Lcom/bumptech/glide/Registry;
/* const-class v0, Landroid/content/res/AssetFileDescriptor; */
/* .line 89 */
(( com.bumptech.glide.Registry ) v1 ).a ( v6, v0, v3 ); // invoke-virtual {v1, v6, v0, v3}, Lcom/bumptech/glide/Registry;->a(Ljava/lang/Class;Ljava/lang/Class;Le/b/a/y/y/x0;)Lcom/bumptech/glide/Registry;
v0 = java.lang.Integer.TYPE;
/* const-class v5, Landroid/content/res/AssetFileDescriptor; */
/* .line 90 */
(( com.bumptech.glide.Registry ) v1 ).a ( v0, v5, v3 ); // invoke-virtual {v1, v0, v5, v3}, Lcom/bumptech/glide/Registry;->a(Ljava/lang/Class;Ljava/lang/Class;Le/b/a/y/y/x0;)Lcom/bumptech/glide/Registry;
/* const-class v0, Ljava/io/InputStream; */
/* .line 91 */
(( com.bumptech.glide.Registry ) v1 ).a ( v6, v0, v4 ); // invoke-virtual {v1, v6, v0, v4}, Lcom/bumptech/glide/Registry;->a(Ljava/lang/Class;Ljava/lang/Class;Le/b/a/y/y/x0;)Lcom/bumptech/glide/Registry;
v0 = java.lang.Integer.TYPE;
/* const-class v3, Ljava/io/InputStream; */
/* .line 92 */
(( com.bumptech.glide.Registry ) v1 ).a ( v0, v3, v4 ); // invoke-virtual {v1, v0, v3, v4}, Lcom/bumptech/glide/Registry;->a(Ljava/lang/Class;Ljava/lang/Class;Le/b/a/y/y/x0;)Lcom/bumptech/glide/Registry;
/* .line 93 */
/* const-class v0, Ljava/io/InputStream; */
/* new-instance v3, Le/b/a/y/y/s; */
/* invoke-direct {v3}, Le/b/a/y/y/s;-><init>()V */
/* move-object/from16 v4, v17 */
/* .line 94 */
(( com.bumptech.glide.Registry ) v1 ).a ( v4, v0, v3 ); // invoke-virtual {v1, v4, v0, v3}, Lcom/bumptech/glide/Registry;->a(Ljava/lang/Class;Ljava/lang/Class;Le/b/a/y/y/x0;)Lcom/bumptech/glide/Registry;
/* const-class v0, Landroid/net/Uri; */
/* const-class v3, Ljava/io/InputStream; */
/* new-instance v5, Le/b/a/y/y/s; */
/* invoke-direct {v5}, Le/b/a/y/y/s;-><init>()V */
/* .line 95 */
(( com.bumptech.glide.Registry ) v1 ).a ( v0, v3, v5 ); // invoke-virtual {v1, v0, v3, v5}, Lcom/bumptech/glide/Registry;->a(Ljava/lang/Class;Ljava/lang/Class;Le/b/a/y/y/x0;)Lcom/bumptech/glide/Registry;
/* const-class v0, Ljava/io/InputStream; */
/* new-instance v3, Le/b/a/y/y/r1; */
/* invoke-direct {v3}, Le/b/a/y/y/r1;-><init>()V */
/* .line 96 */
(( com.bumptech.glide.Registry ) v1 ).a ( v4, v0, v3 ); // invoke-virtual {v1, v4, v0, v3}, Lcom/bumptech/glide/Registry;->a(Ljava/lang/Class;Ljava/lang/Class;Le/b/a/y/y/x0;)Lcom/bumptech/glide/Registry;
/* const-class v0, Landroid/os/ParcelFileDescriptor; */
/* new-instance v3, Le/b/a/y/y/q1; */
/* invoke-direct {v3}, Le/b/a/y/y/q1;-><init>()V */
/* .line 97 */
(( com.bumptech.glide.Registry ) v1 ).a ( v4, v0, v3 ); // invoke-virtual {v1, v4, v0, v3}, Lcom/bumptech/glide/Registry;->a(Ljava/lang/Class;Ljava/lang/Class;Le/b/a/y/y/x0;)Lcom/bumptech/glide/Registry;
/* const-class v0, Landroid/content/res/AssetFileDescriptor; */
/* new-instance v3, Le/b/a/y/y/p1; */
/* invoke-direct {v3}, Le/b/a/y/y/p1;-><init>()V */
/* .line 98 */
(( com.bumptech.glide.Registry ) v1 ).a ( v4, v0, v3 ); // invoke-virtual {v1, v4, v0, v3}, Lcom/bumptech/glide/Registry;->a(Ljava/lang/Class;Ljava/lang/Class;Le/b/a/y/y/x0;)Lcom/bumptech/glide/Registry;
/* const-class v0, Landroid/net/Uri; */
/* const-class v3, Ljava/io/InputStream; */
/* new-instance v4, Le/b/a/y/y/c; */
/* .line 99 */
/* invoke-virtual/range {p0 ..p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager; */
/* invoke-direct {v4, v5}, Le/b/a/y/y/c;-><init>(Landroid/content/res/AssetManager;)V */
(( com.bumptech.glide.Registry ) v1 ).a ( v0, v3, v4 ); // invoke-virtual {v1, v0, v3, v4}, Lcom/bumptech/glide/Registry;->a(Ljava/lang/Class;Ljava/lang/Class;Le/b/a/y/y/x0;)Lcom/bumptech/glide/Registry;
/* const-class v0, Landroid/net/Uri; */
/* const-class v3, Landroid/content/res/AssetFileDescriptor; */
/* new-instance v4, Le/b/a/y/y/b; */
/* .line 100 */
/* invoke-virtual/range {p0 ..p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager; */
/* invoke-direct {v4, v5}, Le/b/a/y/y/b;-><init>(Landroid/content/res/AssetManager;)V */
/* .line 101 */
(( com.bumptech.glide.Registry ) v1 ).a ( v0, v3, v4 ); // invoke-virtual {v1, v0, v3, v4}, Lcom/bumptech/glide/Registry;->a(Ljava/lang/Class;Ljava/lang/Class;Le/b/a/y/y/x0;)Lcom/bumptech/glide/Registry;
/* const-class v0, Landroid/net/Uri; */
/* const-class v3, Ljava/io/InputStream; */
/* new-instance v4, Le/b/a/y/y/d2/c; */
/* move-object/from16 v5, p0 */
/* invoke-direct {v4, v5}, Le/b/a/y/y/d2/c;-><init>(Landroid/content/Context;)V */
/* .line 102 */
(( com.bumptech.glide.Registry ) v1 ).a ( v0, v3, v4 ); // invoke-virtual {v1, v0, v3, v4}, Lcom/bumptech/glide/Registry;->a(Ljava/lang/Class;Ljava/lang/Class;Le/b/a/y/y/x0;)Lcom/bumptech/glide/Registry;
/* const-class v0, Landroid/net/Uri; */
/* const-class v3, Ljava/io/InputStream; */
/* new-instance v4, Le/b/a/y/y/d2/e; */
/* invoke-direct {v4, v5}, Le/b/a/y/y/d2/e;-><init>(Landroid/content/Context;)V */
/* .line 103 */
(( com.bumptech.glide.Registry ) v1 ).a ( v0, v3, v4 ); // invoke-virtual {v1, v0, v3, v4}, Lcom/bumptech/glide/Registry;->a(Ljava/lang/Class;Ljava/lang/Class;Le/b/a/y/y/x0;)Lcom/bumptech/glide/Registry;
/* .line 104 */
/* const/16 v3, 0x1d */
/* if-lt v0, v3, :cond_5 */
/* .line 105 */
/* const-class v0, Landroid/net/Uri; */
/* const-class v3, Ljava/io/InputStream; */
/* new-instance v4, Le/b/a/y/y/d2/i; */
/* invoke-direct {v4, v5}, Le/b/a/y/y/d2/i;-><init>(Landroid/content/Context;)V */
(( com.bumptech.glide.Registry ) v1 ).a ( v0, v3, v4 ); // invoke-virtual {v1, v0, v3, v4}, Lcom/bumptech/glide/Registry;->a(Ljava/lang/Class;Ljava/lang/Class;Le/b/a/y/y/x0;)Lcom/bumptech/glide/Registry;
/* .line 106 */
/* const-class v0, Landroid/net/Uri; */
/* const-class v3, Landroid/os/ParcelFileDescriptor; */
/* new-instance v4, Le/b/a/y/y/d2/h; */
/* invoke-direct {v4, v5}, Le/b/a/y/y/d2/h;-><init>(Landroid/content/Context;)V */
(( com.bumptech.glide.Registry ) v1 ).a ( v0, v3, v4 ); // invoke-virtual {v1, v0, v3, v4}, Lcom/bumptech/glide/Registry;->a(Ljava/lang/Class;Ljava/lang/Class;Le/b/a/y/y/x0;)Lcom/bumptech/glide/Registry;
/* .line 107 */
} // :cond_5
/* const-class v0, Landroid/net/Uri; */
/* const-class v3, Ljava/io/InputStream; */
/* new-instance v4, Le/b/a/y/y/z1; */
/* move-object/from16 v6, v20 */
/* invoke-direct {v4, v6}, Le/b/a/y/y/z1;-><init>(Landroid/content/ContentResolver;)V */
/* .line 108 */
(( com.bumptech.glide.Registry ) v1 ).a ( v0, v3, v4 ); // invoke-virtual {v1, v0, v3, v4}, Lcom/bumptech/glide/Registry;->a(Ljava/lang/Class;Ljava/lang/Class;Le/b/a/y/y/x0;)Lcom/bumptech/glide/Registry;
/* const-class v0, Landroid/net/Uri; */
/* const-class v3, Landroid/os/ParcelFileDescriptor; */
/* new-instance v4, Le/b/a/y/y/x1; */
/* invoke-direct {v4, v6}, Le/b/a/y/y/x1;-><init>(Landroid/content/ContentResolver;)V */
/* .line 109 */
(( com.bumptech.glide.Registry ) v1 ).a ( v0, v3, v4 ); // invoke-virtual {v1, v0, v3, v4}, Lcom/bumptech/glide/Registry;->a(Ljava/lang/Class;Ljava/lang/Class;Le/b/a/y/y/x0;)Lcom/bumptech/glide/Registry;
/* const-class v0, Landroid/net/Uri; */
/* const-class v3, Landroid/content/res/AssetFileDescriptor; */
/* new-instance v4, Le/b/a/y/y/w1; */
/* invoke-direct {v4, v6}, Le/b/a/y/y/w1;-><init>(Landroid/content/ContentResolver;)V */
/* .line 110 */
(( com.bumptech.glide.Registry ) v1 ).a ( v0, v3, v4 ); // invoke-virtual {v1, v0, v3, v4}, Lcom/bumptech/glide/Registry;->a(Ljava/lang/Class;Ljava/lang/Class;Le/b/a/y/y/x0;)Lcom/bumptech/glide/Registry;
/* const-class v0, Landroid/net/Uri; */
/* const-class v3, Ljava/io/InputStream; */
/* new-instance v4, Le/b/a/y/y/b2; */
/* invoke-direct {v4}, Le/b/a/y/y/b2;-><init>()V */
/* .line 111 */
(( com.bumptech.glide.Registry ) v1 ).a ( v0, v3, v4 ); // invoke-virtual {v1, v0, v3, v4}, Lcom/bumptech/glide/Registry;->a(Ljava/lang/Class;Ljava/lang/Class;Le/b/a/y/y/x0;)Lcom/bumptech/glide/Registry;
/* const-class v0, Ljava/net/URL; */
/* const-class v3, Ljava/io/InputStream; */
/* new-instance v4, Le/b/a/y/y/d2/l; */
/* invoke-direct {v4}, Le/b/a/y/y/d2/l;-><init>()V */
/* .line 112 */
(( com.bumptech.glide.Registry ) v1 ).a ( v0, v3, v4 ); // invoke-virtual {v1, v0, v3, v4}, Lcom/bumptech/glide/Registry;->a(Ljava/lang/Class;Ljava/lang/Class;Le/b/a/y/y/x0;)Lcom/bumptech/glide/Registry;
/* const-class v0, Landroid/net/Uri; */
/* const-class v3, Ljava/io/File; */
/* new-instance v4, Le/b/a/y/y/p0; */
/* invoke-direct {v4, v5}, Le/b/a/y/y/p0;-><init>(Landroid/content/Context;)V */
/* .line 113 */
(( com.bumptech.glide.Registry ) v1 ).a ( v0, v3, v4 ); // invoke-virtual {v1, v0, v3, v4}, Lcom/bumptech/glide/Registry;->a(Ljava/lang/Class;Ljava/lang/Class;Le/b/a/y/y/x0;)Lcom/bumptech/glide/Registry;
/* const-class v0, Le/b/a/y/y/i0; */
/* const-class v3, Ljava/io/InputStream; */
/* new-instance v4, Le/b/a/y/y/d2/a; */
/* invoke-direct {v4}, Le/b/a/y/y/d2/a;-><init>()V */
/* .line 114 */
(( com.bumptech.glide.Registry ) v1 ).a ( v0, v3, v4 ); // invoke-virtual {v1, v0, v3, v4}, Lcom/bumptech/glide/Registry;->a(Ljava/lang/Class;Ljava/lang/Class;Le/b/a/y/y/x0;)Lcom/bumptech/glide/Registry;
/* const-class v0, Ljava/nio/ByteBuffer; */
/* new-instance v3, Le/b/a/y/y/f; */
/* invoke-direct {v3}, Le/b/a/y/y/f;-><init>()V */
/* move-object/from16 v4, v16 */
/* .line 115 */
(( com.bumptech.glide.Registry ) v1 ).a ( v4, v0, v3 ); // invoke-virtual {v1, v4, v0, v3}, Lcom/bumptech/glide/Registry;->a(Ljava/lang/Class;Ljava/lang/Class;Le/b/a/y/y/x0;)Lcom/bumptech/glide/Registry;
/* const-class v0, Ljava/io/InputStream; */
/* new-instance v3, Le/b/a/y/y/j; */
/* invoke-direct {v3}, Le/b/a/y/y/j;-><init>()V */
/* .line 116 */
(( com.bumptech.glide.Registry ) v1 ).a ( v4, v0, v3 ); // invoke-virtual {v1, v4, v0, v3}, Lcom/bumptech/glide/Registry;->a(Ljava/lang/Class;Ljava/lang/Class;Le/b/a/y/y/x0;)Lcom/bumptech/glide/Registry;
/* const-class v0, Landroid/net/Uri; */
/* const-class v3, Landroid/net/Uri; */
/* .line 117 */
e.b.a.y.y.t1 .a ( );
(( com.bumptech.glide.Registry ) v1 ).a ( v0, v3, v5 ); // invoke-virtual {v1, v0, v3, v5}, Lcom/bumptech/glide/Registry;->a(Ljava/lang/Class;Ljava/lang/Class;Le/b/a/y/y/x0;)Lcom/bumptech/glide/Registry;
/* const-class v0, Landroid/graphics/drawable/Drawable; */
/* const-class v3, Landroid/graphics/drawable/Drawable; */
/* .line 118 */
e.b.a.y.y.t1 .a ( );
(( com.bumptech.glide.Registry ) v1 ).a ( v0, v3, v5 ); // invoke-virtual {v1, v0, v3, v5}, Lcom/bumptech/glide/Registry;->a(Ljava/lang/Class;Ljava/lang/Class;Le/b/a/y/y/x0;)Lcom/bumptech/glide/Registry;
/* const-class v0, Landroid/graphics/drawable/Drawable; */
/* const-class v3, Landroid/graphics/drawable/Drawable; */
/* new-instance v5, Le/b/a/y/z/g/i; */
/* invoke-direct {v5}, Le/b/a/y/z/g/i;-><init>()V */
/* .line 119 */
(( com.bumptech.glide.Registry ) v1 ).a ( v0, v3, v5 ); // invoke-virtual {v1, v0, v3, v5}, Lcom/bumptech/glide/Registry;->a(Ljava/lang/Class;Ljava/lang/Class;Le/b/a/y/t;)Lcom/bumptech/glide/Registry;
/* const-class v0, Landroid/graphics/Bitmap; */
/* const-class v3, Landroid/graphics/drawable/BitmapDrawable; */
/* new-instance v5, Le/b/a/y/z/j/b; */
/* invoke-direct {v5, v8}, Le/b/a/y/z/j/b;-><init>(Landroid/content/res/Resources;)V */
/* .line 120 */
(( com.bumptech.glide.Registry ) v1 ).a ( v0, v3, v5 ); // invoke-virtual {v1, v0, v3, v5}, Lcom/bumptech/glide/Registry;->a(Ljava/lang/Class;Ljava/lang/Class;Le/b/a/y/z/j/e;)Lcom/bumptech/glide/Registry;
/* const-class v0, Landroid/graphics/Bitmap; */
/* move-object/from16 v3, p4 */
/* .line 121 */
(( com.bumptech.glide.Registry ) v1 ).a ( v0, v4, v3 ); // invoke-virtual {v1, v0, v4, v3}, Lcom/bumptech/glide/Registry;->a(Ljava/lang/Class;Ljava/lang/Class;Le/b/a/y/z/j/e;)Lcom/bumptech/glide/Registry;
/* const-class v0, Landroid/graphics/drawable/Drawable; */
/* new-instance v5, Le/b/a/y/z/j/c; */
/* move-object/from16 v6, v19 */
/* invoke-direct {v5, v2, v3, v6}, Le/b/a/y/z/j/c;-><init>(Le/b/a/y/x/f1/g;Le/b/a/y/z/j/e;Le/b/a/y/z/j/e;)V */
/* .line 122 */
(( com.bumptech.glide.Registry ) v1 ).a ( v0, v4, v5 ); // invoke-virtual {v1, v0, v4, v5}, Lcom/bumptech/glide/Registry;->a(Ljava/lang/Class;Ljava/lang/Class;Le/b/a/y/z/j/e;)Lcom/bumptech/glide/Registry;
/* const-class v0, Le/b/a/y/z/i/f; */
/* .line 123 */
(( com.bumptech.glide.Registry ) v1 ).a ( v0, v4, v6 ); // invoke-virtual {v1, v0, v4, v6}, Lcom/bumptech/glide/Registry;->a(Ljava/lang/Class;Ljava/lang/Class;Le/b/a/y/z/j/e;)Lcom/bumptech/glide/Registry;
/* .line 124 */
/* const/16 v3, 0x17 */
/* if-lt v0, v3, :cond_6 */
/* .line 125 */
/* invoke-static/range {p2 ..p2}, Le/b/a/y/z/e/d1;->b(Le/b/a/y/x/f1/g;)Le/b/a/y/t; */
/* .line 126 */
/* const-class v2, Ljava/nio/ByteBuffer; */
/* const-class v3, Landroid/graphics/Bitmap; */
(( com.bumptech.glide.Registry ) v1 ).a ( v2, v3, v0 ); // invoke-virtual {v1, v2, v3, v0}, Lcom/bumptech/glide/Registry;->a(Ljava/lang/Class;Ljava/lang/Class;Le/b/a/y/t;)Lcom/bumptech/glide/Registry;
/* .line 127 */
/* const-class v2, Ljava/nio/ByteBuffer; */
/* const-class v3, Landroid/graphics/drawable/BitmapDrawable; */
/* new-instance v4, Le/b/a/y/z/e/a; */
/* invoke-direct {v4, v8, v0}, Le/b/a/y/z/e/a;-><init>(Landroid/content/res/Resources;Le/b/a/y/t;)V */
(( com.bumptech.glide.Registry ) v1 ).a ( v2, v3, v4 ); // invoke-virtual {v1, v2, v3, v4}, Lcom/bumptech/glide/Registry;->a(Ljava/lang/Class;Ljava/lang/Class;Le/b/a/y/t;)Lcom/bumptech/glide/Registry;
} // :cond_6
return;
} // .end method
public static void a ( android.content.Context p0, Object p1, com.bumptech.glide.Registry p2, java.util.List p3, Object p4 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroid/content/Context;", */
/* "Le/b/a/d;", */
/* "Lcom/bumptech/glide/Registry;", */
/* "Ljava/util/List<", */
/* "Le/b/a/a0/c;", */
/* ">;", */
/* "Le/b/a/a0/a;", */
/* ")V" */
/* } */
} // .end annotation
/* .line 128 */
v0 = } // :goto_0
if ( v0 != null) { // if-eqz v0, :cond_0
/* check-cast v0, Le/b/a/a0/c; */
/* .line 129 */
try { // :try_start_0
/* :try_end_0 */
/* .catch Ljava/lang/AbstractMethodError; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception p0 */
/* .line 130 */
/* new-instance p1, Ljava/lang/IllegalStateException; */
/* new-instance p2, Ljava/lang/StringBuilder; */
/* invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V */
final String p3 = "Attempting to register a Glide v3 module.If you see this, you or one of your dependencies may be including Glide v3 even though you\'re using Glide v4.You\'ll need to find and remove (or update) the offending dependency.The v3 module name is: "; // const-string p3, "Attempting to register a Glide v3 module.If you see this, you or one of your dependencies may be including Glide v3 even though you\'re using Glide v4.You\'ll need to find and remove (or update) the offending dependency.The v3 module name is: "
(( java.lang.StringBuilder ) p2 ).append ( p3 ); // invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 131 */
(( java.lang.Object ) v0 ).getClass ( ); // invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
(( java.lang.Class ) p3 ).getName ( ); // invoke-virtual {p3}, Ljava/lang/Class;->getName()Ljava/lang/String;
(( java.lang.StringBuilder ) p2 ).append ( p3 ); // invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p2 ).toString ( ); // invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p1, p2, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V */
/* throw p1 */
} // :cond_0
if ( p4 != null) { // if-eqz p4, :cond_1
/* .line 132 */
(( e.b.a.a0.d ) p4 ).a ( p0, p1, p2 ); // invoke-virtual {p4, p0, p1, p2}, Le/b/a/a0/d;->a(Landroid/content/Context;Le/b/a/d;Lcom/bumptech/glide/Registry;)V
} // :cond_1
return;
} // .end method
public static e.b.a.e0.k b ( Object p0, java.util.List p1, Object p2 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Le/b/a/d;", */
/* "Ljava/util/List<", */
/* "Le/b/a/a0/c;", */
/* ">;", */
/* "Le/b/a/a0/a;", */
/* ")", */
/* "Le/b/a/e0/k<", */
/* "Lcom/bumptech/glide/Registry;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 1 */
/* new-instance v0, Le/b/a/p; */
/* invoke-direct {v0, p0, p1, p2}, Le/b/a/p;-><init>(Le/b/a/d;Ljava/util/List;Le/b/a/a0/a;)V */
} // .end method
