public abstract class e.f.d.d0.f0 {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public e.f.d.d0.f0 ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static e.f.d.d0.f0 a ( ) {
		 /* .locals 9 */
		 final String v0 = "newInstance"; // const-string v0, "newInstance"
		 int v1 = 0; // const/4 v1, 0x0
		 int v2 = 0; // const/4 v2, 0x0
		 int v3 = 1; // const/4 v3, 0x1
		 try { // :try_start_0
			 final String v4 = "sun.misc.Unsafe"; // const-string v4, "sun.misc.Unsafe"
			 /* .line 1 */
			 java.lang.Class .forName ( v4 );
			 final String v5 = "theUnsafe"; // const-string v5, "theUnsafe"
			 /* .line 2 */
			 (( java.lang.Class ) v4 ).getDeclaredField ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;
			 /* .line 3 */
			 (( java.lang.reflect.Field ) v5 ).setAccessible ( v3 ); // invoke-virtual {v5, v3}, Ljava/lang/reflect/Field;->setAccessible(Z)V
			 /* .line 4 */
			 (( java.lang.reflect.Field ) v5 ).get ( v1 ); // invoke-virtual {v5, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;
			 final String v6 = "allocateInstance"; // const-string v6, "allocateInstance"
			 /* new-array v7, v3, [Ljava/lang/Class; */
			 /* .line 5 */
			 /* const-class v8, Ljava/lang/Class; */
			 /* aput-object v8, v7, v2 */
			 (( java.lang.Class ) v4 ).getMethod ( v6, v7 ); // invoke-virtual {v4, v6, v7}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
			 /* .line 6 */
			 /* new-instance v6, Le/f/d/d0/b0; */
			 /* invoke-direct {v6, v4, v5}, Le/f/d/d0/b0;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V */
			 /* :try_end_0 */
			 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* :catch_0 */
			 int v4 = 2; // const/4 v4, 0x2
			 /* .line 7 */
			 try { // :try_start_1
				 /* const-class v5, Ljava/io/ObjectInputStream; */
				 /* new-array v6, v4, [Ljava/lang/Class; */
				 /* const-class v7, Ljava/lang/Class; */
				 /* aput-object v7, v6, v2 */
				 /* const-class v7, Ljava/lang/Class; */
				 /* aput-object v7, v6, v3 */
				 (( java.lang.Class ) v5 ).getDeclaredMethod ( v0, v6 ); // invoke-virtual {v5, v0, v6}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
				 /* .line 8 */
				 (( java.lang.reflect.Method ) v5 ).setAccessible ( v3 ); // invoke-virtual {v5, v3}, Ljava/lang/reflect/Method;->setAccessible(Z)V
				 /* .line 9 */
				 /* new-instance v6, Le/f/d/d0/c0; */
				 /* invoke-direct {v6, v5}, Le/f/d/d0/c0;-><init>(Ljava/lang/reflect/Method;)V */
				 /* :try_end_1 */
				 /* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_1 */
				 /* .line 10 */
				 /* :catch_1 */
				 try { // :try_start_2
					 /* const-class v5, Ljava/io/ObjectStreamClass; */
					 final String v6 = "getConstructorId"; // const-string v6, "getConstructorId"
					 /* new-array v7, v3, [Ljava/lang/Class; */
					 /* const-class v8, Ljava/lang/Class; */
					 /* aput-object v8, v7, v2 */
					 (( java.lang.Class ) v5 ).getDeclaredMethod ( v6, v7 ); // invoke-virtual {v5, v6, v7}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
					 /* .line 11 */
					 (( java.lang.reflect.Method ) v5 ).setAccessible ( v3 ); // invoke-virtual {v5, v3}, Ljava/lang/reflect/Method;->setAccessible(Z)V
					 /* new-array v6, v3, [Ljava/lang/Object; */
					 /* .line 12 */
					 /* const-class v7, Ljava/lang/Object; */
					 /* aput-object v7, v6, v2 */
					 (( java.lang.reflect.Method ) v5 ).invoke ( v1, v6 ); // invoke-virtual {v5, v1, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
					 /* check-cast v1, Ljava/lang/Integer; */
					 v1 = 					 (( java.lang.Integer ) v1 ).intValue ( ); // invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I
					 /* .line 13 */
					 /* const-class v5, Ljava/io/ObjectStreamClass; */
					 /* new-array v4, v4, [Ljava/lang/Class; */
					 /* const-class v6, Ljava/lang/Class; */
					 /* aput-object v6, v4, v2 */
					 v2 = java.lang.Integer.TYPE;
					 /* aput-object v2, v4, v3 */
					 (( java.lang.Class ) v5 ).getDeclaredMethod ( v0, v4 ); // invoke-virtual {v5, v0, v4}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
					 /* .line 14 */
					 (( java.lang.reflect.Method ) v0 ).setAccessible ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/reflect/Method;->setAccessible(Z)V
					 /* .line 15 */
					 /* new-instance v2, Le/f/d/d0/d0; */
					 /* invoke-direct {v2, v0, v1}, Le/f/d/d0/d0;-><init>(Ljava/lang/reflect/Method;I)V */
					 /* :try_end_2 */
					 /* .catch Ljava/lang/Exception; {:try_start_2 ..:try_end_2} :catch_2 */
					 /* .line 16 */
					 /* :catch_2 */
					 /* new-instance v0, Le/f/d/d0/e0; */
					 /* invoke-direct {v0}, Le/f/d/d0/e0;-><init>()V */
				 } // .end method
				 /* # virtual methods */
				 public abstract java.lang.Object a ( java.lang.Class p0 ) {
					 /* .annotation system Ldalvik/annotation/Signature; */
					 /* value = { */
					 /* "<T:", */
					 /* "Ljava/lang/Object;", */
					 /* ">(", */
					 /* "Ljava/lang/Class<", */
					 /* "TT;>;)TT;" */
					 /* } */
				 } // .end annotation
				 /* .annotation system Ldalvik/annotation/Throws; */
				 /* value = { */
				 /* Ljava/lang/Exception; */
				 /* } */
			 } // .end annotation
		 } // .end method
