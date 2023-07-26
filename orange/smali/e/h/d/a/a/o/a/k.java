public class e.h.d.a.a.o.a.k {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final com.orange.oab.contactless.packid.hce.user.wallet.Wallet a;
	 public final e.h.d.a.a.o.a.c b;
	 public final e.h.d.a.a.n.w.c c;
	 public final fr.mbs.binary.Octets d;
	 public final fr.mbs.binary.Octets e;
	 /* # direct methods */
	 public e.h.d.a.a.o.a.k ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 this.a = p1;
		 /* .line 3 */
		 this.b = p2;
		 /* .line 4 */
		 this.c = p3;
		 /* .line 5 */
		 fr.mbs.binary.Octets .empty ( );
		 this.d = p1;
		 /* .line 6 */
		 fr.mbs.binary.Octets .empty ( );
		 this.e = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public fr.mbs.binary.Octets a ( android.content.Context p0, fr.mbs.binary.Octets p1 ) {
		 /* .locals 4 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Lcom/orange/oab/contactless/packid/h/a/a;, */
		 /* Lcom/orange/oab/contactless/packid/g/u/e; */
		 /* } */
	 } // .end annotation
	 /* .line 1 */
	 try { // :try_start_0
		 v0 = this.a;
		 v1 = this.c;
		 v2 = this.d;
		 v3 = this.e;
		 e.h.d.a.a.o.a.j .a ( v0,p2,v1,v2,v3 );
		 /* .line 2 */
		 /* new-instance v1, Le/h/d/a/a/o/a/q; */
		 final String v2 = "process"; // const-string v2, "process"
		 int v3 = 1; // const/4 v3, 0x1
		 /* invoke-direct {v1, p0, v2, v3}, Le/h/d/a/a/o/a/q;-><init>(Ljava/lang/Object;Ljava/lang/String;I)V */
		 (( java.lang.Enum ) v2 ).name ( ); // invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;
		 (( e.h.d.a.a.o.a.q ) v1 ).a ( v2 ); // invoke-virtual {v1, v2}, Le/h/d/a/a/o/a/q;->a(Ljava/lang/String;)Le/h/d/a/a/o/a/q;
		 /* .line 3 */
		 e.h.c.a.a .d ( p2 );
		 /* .line 4 */
		 v2 = this.b;
		 if ( v2 != null) { // if-eqz v2, :cond_0
			 v2 = 			 (( e.h.d.a.a.o.a.l ) p1 ).c ( ); // invoke-virtual {p1}, Le/h/d/a/a/o/a/l;->c()Z
			 if ( v2 != null) { // if-eqz v2, :cond_0
				 /* .line 5 */
				 v2 = this.b;
				 (( e.h.d.a.a.o.a.l ) p1 ).b ( ); // invoke-virtual {p1}, Le/h/d/a/a/o/a/l;->b()Lfr/mbs/binary/Octets;
				 /* .line 6 */
			 } // :cond_0
			 (( e.h.d.a.a.o.a.q ) v1 ).a ( ); // invoke-virtual {v1}, Le/h/d/a/a/o/a/q;->a()V
			 /* .line 7 */
			 (( e.h.d.a.a.o.a.l ) p1 ).a ( ); // invoke-virtual {p1}, Le/h/d/a/a/o/a/l;->a()Lfr/mbs/binary/Octets;
			 /* :try_end_0 */
			 /* .catch Lcom/orange/nfc/apdu/InvalidApduFormatException; {:try_start_0 ..:try_end_0} :catch_2 */
			 /* .catch Lcom/orange/oab/contactless/packid/h/a/b; {:try_start_0 ..:try_end_0} :catch_1 */
			 /* .catch Ljava/lang/RuntimeException; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* :catch_0 */
			 /* move-exception p1 */
			 /* .line 8 */
			 /* new-instance v0, Lcom/orange/oab/contactless/packid/h/a/a; */
			 /* new-instance v1, Ljava/lang/StringBuilder; */
			 /* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
			 final String v2 = "Unexpected error processing APDU "; // const-string v2, "Unexpected error processing APDU "
			 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v1 ).append ( p2 ); // invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
			 v1 = e.h.d.a.a.o.a.b.b;
			 /* invoke-direct {v0, p2, v1, p1}, Lcom/orange/oab/contactless/packid/h/a/a;-><init>(Ljava/lang/String;Lfr/mbs/binary/Octets;Ljava/lang/Throwable;)V */
			 /* throw v0 */
			 /* :catch_1 */
			 /* move-exception p1 */
			 /* .line 9 */
			 /* new-instance v0, Lcom/orange/oab/contactless/packid/h/a/a; */
			 /* new-instance v1, Ljava/lang/StringBuilder; */
			 /* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
			 final String v2 = "Callback execution error on APDU "; // const-string v2, "Callback execution error on APDU "
			 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v1 ).append ( p2 ); // invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
			 v1 = e.h.d.a.a.o.a.b.b;
			 /* invoke-direct {v0, p2, v1, p1}, Lcom/orange/oab/contactless/packid/h/a/a;-><init>(Ljava/lang/String;Lfr/mbs/binary/Octets;Ljava/lang/Throwable;)V */
			 /* throw v0 */
			 /* :catch_2 */
			 /* move-exception p1 */
			 /* .line 10 */
			 /* new-instance v0, Lcom/orange/oab/contactless/packid/h/a/a; */
			 /* new-instance v1, Ljava/lang/StringBuilder; */
			 /* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
			 final String v2 = "Invalid APDU format "; // const-string v2, "Invalid APDU format "
			 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v1 ).append ( p2 ); // invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
			 v1 = e.h.d.a.a.o.a.b.f;
			 /* invoke-direct {v0, p2, v1, p1}, Lcom/orange/oab/contactless/packid/h/a/a;-><init>(Ljava/lang/String;Lfr/mbs/binary/Octets;Ljava/lang/Throwable;)V */
			 /* throw v0 */
		 } // .end method
