public abstract class e.f.a.d.a.e.w {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final e.f.a.d.a.e.q a;
	 /* # direct methods */
	 public static e.f.a.d.a.e.w ( ) {
		 /* .locals 6 */
		 int v0 = 0; // const/4 v0, 0x0
		 try { // :try_start_0
			 final String v1 = "android.os.Build$VERSION"; // const-string v1, "android.os.Build$VERSION"
			 java.lang.Class .forName ( v1 );
			 final String v2 = "SDK_INT"; // const-string v2, "SDK_INT"
			 (( java.lang.Class ) v1 ).getField ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;
			 (( java.lang.reflect.Field ) v1 ).get ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;
			 /* check-cast v1, Ljava/lang/Integer; */
			 /* :try_end_0 */
			 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
			 /* move-object v0, v1 */
			 /* :catch_0 */
			 /* move-exception v1 */
			 try { // :try_start_1
				 v2 = java.lang.System.err;
				 final String v3 = "Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception."; // const-string v3, "Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception."
				 (( java.io.PrintStream ) v2 ).println ( v3 ); // invoke-virtual {v2, v3}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
				 v2 = java.lang.System.err;
				 (( java.lang.Exception ) v1 ).printStackTrace ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/Exception;->printStackTrace(Ljava/io/PrintStream;)V
			 } // :goto_0
			 if ( v0 != null) { // if-eqz v0, :cond_0
				 v1 = 				 (( java.lang.Integer ) v0 ).intValue ( ); // invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
				 /* const/16 v2, 0x13 */
				 /* if-lt v1, v2, :cond_0 */
				 /* new-instance v1, Le/f/a/d/a/e/v; */
				 /* invoke-direct {v1}, Le/f/a/d/a/e/v;-><init>()V */
			 } // :cond_0
			 final String v1 = "com.google.devtools.build.android.desugar.runtime.twr_disable_mimic"; // const-string v1, "com.google.devtools.build.android.desugar.runtime.twr_disable_mimic"
			 v1 = 			 java.lang.Boolean .getBoolean ( v1 );
			 /* if-nez v1, :cond_1 */
			 /* new-instance v1, Le/f/a/d/a/e/t; */
			 /* invoke-direct {v1}, Le/f/a/d/a/e/t;-><init>()V */
		 } // :cond_1
		 /* new-instance v1, Le/f/a/d/a/e/u; */
		 /* invoke-direct {v1}, Le/f/a/d/a/e/u;-><init>()V */
		 /* :try_end_1 */
		 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
		 /* :catchall_0 */
		 /* move-exception v1 */
		 v2 = java.lang.System.err;
		 /* const-class v3, Le/f/a/d/a/e/u; */
		 (( java.lang.Class ) v3 ).getName ( ); // invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;
		 java.lang.String .valueOf ( v3 );
		 v4 = 		 (( java.lang.String ) v4 ).length ( ); // invoke-virtual {v4}, Ljava/lang/String;->length()I
		 /* new-instance v5, Ljava/lang/StringBuilder; */
		 /* add-int/lit16 v4, v4, 0x85 */
		 /* invoke-direct {v5, v4}, Ljava/lang/StringBuilder;-><init>(I)V */
		 final String v4 = "An error has occurred when initializing the try-with-resources desuguring strategy.The default strategy "; // const-string v4, "An error has occurred when initializing the try-with-resources desuguring strategy.The default strategy "
		 (( java.lang.StringBuilder ) v5 ).append ( v4 ); // invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v5 ).append ( v3 ); // invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 final String v3 = "will be used.The error is: "; // const-string v3, "will be used.The error is: "
		 (( java.lang.StringBuilder ) v5 ).append ( v3 ); // invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v5 ).toString ( ); // invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 (( java.io.PrintStream ) v2 ).println ( v3 ); // invoke-virtual {v2, v3}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
		 v2 = java.lang.System.err;
		 (( java.lang.Throwable ) v1 ).printStackTrace ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/Throwable;->printStackTrace(Ljava/io/PrintStream;)V
		 /* new-instance v1, Le/f/a/d/a/e/u; */
		 /* invoke-direct {v1}, Le/f/a/d/a/e/u;-><init>()V */
	 } // :goto_1
	 /* if-nez v0, :cond_2 */
	 return;
} // :cond_2
(( java.lang.Integer ) v0 ).intValue ( ); // invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
return;
} // .end method
public static void a ( java.lang.Throwable p0, java.lang.Throwable p1 ) {
/* .locals 1 */
v0 = e.f.a.d.a.e.w.a;
(( e.f.a.d.a.e.q ) v0 ).a ( p0, p1 ); // invoke-virtual {v0, p0, p1}, Le/f/a/d/a/e/q;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
return;
} // .end method
