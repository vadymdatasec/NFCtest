public abstract class e.f.a.b.e.d.l {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final e.f.a.b.e.d.o a;
	 /* # direct methods */
	 public static e.f.a.b.e.d.l ( ) {
		 /* .locals 6 */
		 /* .line 1 */
		 try { // :try_start_0
			 e.f.a.b.e.d.l .a ( );
			 /* :try_end_0 */
			 /* .catchall {:try_start_0 ..:try_end_0} :catchall_1 */
			 if ( v0 != null) { // if-eqz v0, :cond_0
				 /* .line 2 */
				 try { // :try_start_1
					 v1 = 					 (( java.lang.Integer ) v0 ).intValue ( ); // invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
					 /* const/16 v2, 0x13 */
					 /* if-lt v1, v2, :cond_0 */
					 /* .line 3 */
					 /* new-instance v1, Le/f/a/b/e/d/r; */
					 /* invoke-direct {v1}, Le/f/a/b/e/d/r;-><init>()V */
				 } // :cond_0
				 final String v1 = "com.google.devtools.build.android.desugar.runtime.twr_disable_mimic"; // const-string v1, "com.google.devtools.build.android.desugar.runtime.twr_disable_mimic"
				 /* .line 4 */
				 v1 = 				 java.lang.Boolean .getBoolean ( v1 );
				 /* xor-int/lit8 v1, v1, 0x1 */
				 if ( v1 != null) { // if-eqz v1, :cond_1
					 /* .line 5 */
					 /* new-instance v1, Le/f/a/b/e/d/p; */
					 /* invoke-direct {v1}, Le/f/a/b/e/d/p;-><init>()V */
					 /* .line 6 */
				 } // :cond_1
				 /* new-instance v1, Le/f/a/b/e/d/k; */
				 /* invoke-direct {v1}, Le/f/a/b/e/d/k;-><init>()V */
				 /* :try_end_1 */
				 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
				 /* :catchall_0 */
				 /* move-exception v1 */
				 /* :catchall_1 */
				 /* move-exception v1 */
				 int v0 = 0; // const/4 v0, 0x0
				 /* .line 7 */
			 } // :goto_0
			 v2 = java.lang.System.err;
			 /* const-class v3, Le/f/a/b/e/d/k; */
			 /* .line 8 */
			 (( java.lang.Class ) v3 ).getName ( ); // invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;
			 java.lang.String .valueOf ( v3 );
			 v4 = 			 (( java.lang.String ) v4 ).length ( ); // invoke-virtual {v4}, Ljava/lang/String;->length()I
			 /* add-int/lit16 v4, v4, 0x85 */
			 /* new-instance v5, Ljava/lang/StringBuilder; */
			 /* invoke-direct {v5, v4}, Ljava/lang/StringBuilder;-><init>(I)V */
			 final String v4 = "An error has occurred when initializing the try-with-resources desuguring strategy.The default strategy "; // const-string v4, "An error has occurred when initializing the try-with-resources desuguring strategy.The default strategy "
			 (( java.lang.StringBuilder ) v5 ).append ( v4 ); // invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v5 ).append ( v3 ); // invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 final String v3 = "will be used.The error is: "; // const-string v3, "will be used.The error is: "
			 (( java.lang.StringBuilder ) v5 ).append ( v3 ); // invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v5 ).toString ( ); // invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
			 /* .line 9 */
			 (( java.io.PrintStream ) v2 ).println ( v3 ); // invoke-virtual {v2, v3}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
			 /* .line 10 */
			 v2 = java.lang.System.err;
			 (( java.lang.Throwable ) v1 ).printStackTrace ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/Throwable;->printStackTrace(Ljava/io/PrintStream;)V
			 /* .line 11 */
			 /* new-instance v1, Le/f/a/b/e/d/k; */
			 /* invoke-direct {v1}, Le/f/a/b/e/d/k;-><init>()V */
			 /* .line 12 */
		 } // :goto_1
		 /* if-nez v0, :cond_2 */
		 /* .line 13 */
	 } // :cond_2
	 (( java.lang.Integer ) v0 ).intValue ( ); // invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
} // :goto_2
return;
} // .end method
public static java.lang.Integer a ( ) {
/* .locals 4 */
int v0 = 0; // const/4 v0, 0x0
try { // :try_start_0
	 final String v1 = "android.os.Build$VERSION"; // const-string v1, "android.os.Build$VERSION"
	 /* .line 2 */
	 java.lang.Class .forName ( v1 );
	 final String v2 = "SDK_INT"; // const-string v2, "SDK_INT"
	 /* .line 3 */
	 (( java.lang.Class ) v1 ).getField ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;
	 /* .line 4 */
	 (( java.lang.reflect.Field ) v1 ).get ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;
	 /* check-cast v1, Ljava/lang/Integer; */
	 /* :try_end_0 */
	 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* :catch_0 */
	 /* move-exception v1 */
	 /* .line 5 */
	 v2 = java.lang.System.err;
	 final String v3 = "Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception."; // const-string v3, "Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception."
	 (( java.io.PrintStream ) v2 ).println ( v3 ); // invoke-virtual {v2, v3}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
	 /* .line 6 */
	 v2 = java.lang.System.err;
	 (( java.lang.Exception ) v1 ).printStackTrace ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/Exception;->printStackTrace(Ljava/io/PrintStream;)V
} // .end method
public static void a ( java.lang.Throwable p0, java.lang.Throwable p1 ) {
	 /* .locals 1 */
	 /* .line 1 */
	 v0 = e.f.a.b.e.d.l.a;
	 (( e.f.a.b.e.d.o ) v0 ).a ( p0, p1 ); // invoke-virtual {v0, p0, p1}, Le/f/a/b/e/d/o;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
	 return;
} // .end method
