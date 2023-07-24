.class public final Le/h/d/a/a/w/i;
.super Le/a/a/p;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Le/a/a/p<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final r:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final s:Ljava/lang/String;

.field public final t:Le/f/d/q;

.field public final u:Le/a/a/u;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/a/a/u<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/String;Le/h/d/a/a/w/v;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "TT;>;",
            "Ljava/lang/String;",
            "Le/h/d/a/a/w/v<",
            "TT;>;)V"
        }
    .end annotation

    const-string v0, "clazz"

    invoke-static {p2, v0}, Li/h/c/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "body"

    invoke-static {p3, v0}, Li/h/c/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "listener"

    invoke-static {p4, v0}, Li/h/c/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x2

    .line 1
    invoke-direct {p0, v0, p1, p4}, Le/a/a/p;-><init>(ILjava/lang/String;Le/a/a/t;)V

    .line 2
    iput-object p2, p0, Le/h/d/a/a/w/i;->r:Ljava/lang/Class;

    .line 3
    iput-object p3, p0, Le/h/d/a/a/w/i;->s:Ljava/lang/String;

    .line 4
    new-instance p1, Le/f/d/q;

    invoke-direct {p1}, Le/f/d/q;-><init>()V

    iput-object p1, p0, Le/h/d/a/a/w/i;->t:Le/f/d/q;

    .line 5
    iput-object p4, p0, Le/h/d/a/a/w/i;->u:Le/a/a/u;

    return-void
.end method


# virtual methods
.method public a(Le/a/a/l;)Le/a/a/v;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/a/a/l;",
            ")",
            "Le/a/a/v<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "{\n            Response.e\u2026(ParseError(e))\n        }"

    const-string v1, "response"

    invoke-static {p1, v1}, Li/h/c/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    :try_start_0
    iget-object v1, p1, Le/a/a/l;->b:[B

    const-string v2, "response.data"

    invoke-static {v1, v2}, Li/h/c/k;->b(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Ljava/lang/String;

    sget-object v3, Li/l/c;->a:Ljava/nio/charset/Charset;

    invoke-direct {v2, v1, v3}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 4
    iget-object v1, p0, Le/h/d/a/a/w/i;->t:Le/f/d/q;

    iget-object v3, p0, Le/h/d/a/a/w/i;->r:Ljava/lang/Class;

    invoke-virtual {v1, v2, v3}, Le/f/d/q;->a(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    .line 5
    invoke-static {p1}, Le/a/a/c0/j;->a(Le/a/a/l;)Le/a/a/a;

    move-result-object p1

    .line 6
    invoke-static {v1, p1}, Le/a/a/v;->a(Ljava/lang/Object;Le/a/a/a;)Le/a/a/v;

    move-result-object p1

    const-string v1, "{\n            val json =\u2026ders(response))\n        }"

    .line 7
    invoke-static {p1, v1}, Li/h/c/k;->b(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lcom/google/gson/JsonSyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 8
    new-instance v1, Lcom/android/volley/ParseError;

    invoke-direct {v1, p1}, Lcom/android/volley/ParseError;-><init>(Ljava/lang/Throwable;)V

    invoke-static {v1}, Le/a/a/v;->a(Lcom/android/volley/VolleyError;)Le/a/a/v;

    move-result-object p1

    .line 9
    invoke-static {p1, v0}, Li/h/c/k;->b(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :catch_1
    move-exception p1

    .line 10
    new-instance v1, Lcom/android/volley/ParseError;

    invoke-direct {v1, p1}, Lcom/android/volley/ParseError;-><init>(Ljava/lang/Throwable;)V

    invoke-static {v1}, Le/a/a/v;->a(Lcom/android/volley/VolleyError;)Le/a/a/v;

    move-result-object p1

    .line 11
    invoke-static {p1, v0}, Li/h/c/k;->b(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    return-object p1
.end method

.method public a(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le/h/d/a/a/w/i;->u:Le/a/a/u;

    invoke-interface {v0, p1}, Le/a/a/u;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public a()[B
    .locals 2

    .line 2
    iget-object v0, p0, Le/h/d/a/a/w/i;->s:Ljava/lang/String;

    sget-object v1, Li/l/c;->a:Ljava/nio/charset/Charset;

    if-eqz v0, :cond_0

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    const-string v1, "(this as java.lang.String).getBytes(charset)"

    invoke-static {v0, v1}, Li/h/c/k;->b(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "null cannot be cast to non-null type java.lang.String"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    const-string v0, "application/json"

    return-object v0
.end method

.method public e()Ljava/util/Map;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-string v0, "NFCOffice-client"

    const-string v1, "true"

    .line 1
    invoke-static {v0, v1}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method
