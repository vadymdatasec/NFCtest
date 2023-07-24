.class public Le/h/d/a/a/n/f;
.super Le/a/a/c0/s;
.source "SourceFile"


# instance fields
.field public final t:Le/a/a/s;

.field public final u:Le/h/d/a/a/n/k;

.field public final v:Le/h/d/a/a/n/j;

.field public w:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Le/a/a/s;ILandroid/net/Uri;Le/h/d/a/a/n/k;Le/h/d/a/a/n/j;)V
    .locals 0

    .line 1
    invoke-virtual {p3}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-direct {p0, p2, p3, p4, p5}, Le/a/a/c0/s;-><init>(ILjava/lang/String;Le/a/a/u;Le/a/a/t;)V

    .line 2
    iput-object p1, p0, Le/h/d/a/a/n/f;->t:Le/a/a/s;

    .line 3
    iput-object p4, p0, Le/h/d/a/a/n/f;->u:Le/h/d/a/a/n/k;

    .line 4
    iput-object p5, p0, Le/h/d/a/a/n/f;->v:Le/h/d/a/a/n/j;

    return-void
.end method


# virtual methods
.method public a(Le/a/a/l;)Le/a/a/v;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/a/a/l;",
            ")",
            "Le/a/a/v<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 9
    new-instance v0, Ljava/lang/String;

    iget-object v1, p1, Le/a/a/l;->b:[B

    iget-object v2, p1, Le/a/a/l;->c:Ljava/util/Map;

    invoke-virtual {p0, v2}, Le/h/d/a/a/n/f;->b(Ljava/util/Map;)Ljava/nio/charset/Charset;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 10
    invoke-static {p1}, Le/a/a/c0/j;->a(Le/a/a/l;)Le/a/a/a;

    move-result-object p1

    invoke-static {v0, p1}, Le/a/a/v;->a(Ljava/lang/Object;Le/a/a/a;)Le/a/a/v;

    move-result-object p1

    return-object p1
.end method

.method public a(Lcom/android/volley/VolleyError;)V
    .locals 8

    .line 2
    iget-object v0, p1, Lcom/android/volley/VolleyError;->b:Le/a/a/l;

    if-eqz v0, :cond_0

    iget v1, v0, Le/a/a/l;->a:I

    const/16 v2, 0x12f

    if-ne v1, v2, :cond_0

    .line 3
    iget-object p1, v0, Le/a/a/l;->c:Ljava/util/Map;

    const-string v0, "Location"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    .line 4
    iget-object v0, p0, Le/h/d/a/a/n/f;->u:Le/h/d/a/a/n/k;

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v0, v1}, Le/h/d/a/a/n/k;->a(Landroid/net/Uri;)V

    .line 5
    new-instance v0, Le/h/d/a/a/n/f;

    iget-object v3, p0, Le/h/d/a/a/n/f;->t:Le/a/a/s;

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v5

    iget-object v6, p0, Le/h/d/a/a/n/f;->u:Le/h/d/a/a/n/k;

    iget-object v7, p0, Le/h/d/a/a/n/f;->v:Le/h/d/a/a/n/j;

    const/4 v4, 0x0

    move-object v2, v0

    invoke-direct/range {v2 .. v7}, Le/h/d/a/a/n/f;-><init>(Le/a/a/s;ILandroid/net/Uri;Le/h/d/a/a/n/k;Le/h/d/a/a/n/j;)V

    .line 6
    invoke-virtual {p0}, Le/a/a/p;->u()Z

    move-result p1

    invoke-virtual {v0, p1}, Le/a/a/p;->a(Z)Le/a/a/p;

    .line 7
    iget-object p1, p0, Le/h/d/a/a/n/f;->t:Le/a/a/s;

    invoke-virtual {p1, v0}, Le/a/a/s;->a(Le/a/a/p;)Le/a/a/p;

    goto :goto_0

    .line 8
    :cond_0
    invoke-super {p0, p1}, Le/a/a/p;->a(Lcom/android/volley/VolleyError;)V

    :goto_0
    return-void
.end method

.method public a(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Le/h/d/a/a/n/f;->w:Ljava/util/Map;

    return-void
.end method

.method public final b(Ljava/util/Map;)Ljava/nio/charset/Charset;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/nio/charset/Charset;"
        }
    .end annotation

    const-string v0, "Content-Type"

    .line 1
    invoke-interface {p1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-string v1, "charset"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-static {p1}, Le/a/a/c0/j;->a(Ljava/util/Map;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object p1

    return-object p1

    .line 3
    :cond_0
    sget-object p1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    return-object p1
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

.method public g()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/android/volley/AuthFailureError;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le/h/d/a/a/n/f;->w:Ljava/util/Map;

    return-object v0
.end method
