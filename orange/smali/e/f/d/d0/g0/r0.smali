.class public final Le/f/d/d0/g0/r0;
.super Le/f/d/a0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Le/f/d/a0<",
        "Ljava/util/BitSet;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Le/f/d/a0;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Le/f/d/f0/c;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Le/f/d/d0/g0/r0;->a(Le/f/d/f0/c;)Ljava/util/BitSet;

    move-result-object p1

    return-object p1
.end method

.method public a(Le/f/d/f0/c;)Ljava/util/BitSet;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 3
    invoke-virtual {p1}, Le/f/d/f0/c;->F()Le/f/d/f0/e;

    move-result-object v0

    sget-object v1, Le/f/d/f0/e;->j:Le/f/d/f0/e;

    if-ne v0, v1, :cond_0

    .line 4
    invoke-virtual {p1}, Le/f/d/f0/c;->B()V

    const/4 p1, 0x0

    return-object p1

    .line 5
    :cond_0
    new-instance v0, Ljava/util/BitSet;

    invoke-direct {v0}, Ljava/util/BitSet;-><init>()V

    .line 6
    invoke-virtual {p1}, Le/f/d/f0/c;->l()V

    .line 7
    invoke-virtual {p1}, Le/f/d/f0/c;->F()Le/f/d/f0/e;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 8
    :goto_0
    sget-object v4, Le/f/d/f0/e;->c:Le/f/d/f0/e;

    if-eq v1, v4, :cond_6

    .line 9
    sget-object v4, Le/f/d/d0/g0/u0;->a:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    aget v4, v4, v5

    const/4 v5, 0x1

    if-eq v4, v5, :cond_4

    const/4 v6, 0x2

    if-eq v4, v6, :cond_3

    const/4 v6, 0x3

    if-ne v4, v6, :cond_2

    .line 10
    invoke-virtual {p1}, Le/f/d/f0/c;->C()Ljava/lang/String;

    move-result-object v1

    .line 11
    :try_start_0
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    const/4 v5, 0x0

    goto :goto_1

    .line 12
    :catch_0
    new-instance p1, Lcom/google/gson/JsonSyntaxException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Error: Expecting: bitset number value (1, 0), Found: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/google/gson/JsonSyntaxException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 13
    :cond_2
    new-instance p1, Lcom/google/gson/JsonSyntaxException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid bitset value type: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/google/gson/JsonSyntaxException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 14
    :cond_3
    invoke-virtual {p1}, Le/f/d/f0/c;->w()Z

    move-result v5

    goto :goto_1

    .line 15
    :cond_4
    invoke-virtual {p1}, Le/f/d/f0/c;->y()I

    move-result v1

    if-eqz v1, :cond_1

    :goto_1
    if-eqz v5, :cond_5

    .line 16
    invoke-virtual {v0, v3}, Ljava/util/BitSet;->set(I)V

    :cond_5
    add-int/lit8 v3, v3, 0x1

    .line 17
    invoke-virtual {p1}, Le/f/d/f0/c;->F()Le/f/d/f0/e;

    move-result-object v1

    goto :goto_0

    .line 18
    :cond_6
    invoke-virtual {p1}, Le/f/d/f0/c;->q()V

    return-object v0
.end method

.method public bridge synthetic a(Le/f/d/f0/g;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2
    check-cast p2, Ljava/util/BitSet;

    invoke-virtual {p0, p1, p2}, Le/f/d/d0/g0/r0;->a(Le/f/d/f0/g;Ljava/util/BitSet;)V

    return-void
.end method

.method public a(Le/f/d/f0/g;Ljava/util/BitSet;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    if-nez p2, :cond_0

    .line 19
    invoke-virtual {p1}, Le/f/d/f0/g;->s()Le/f/d/f0/g;

    return-void

    .line 20
    :cond_0
    invoke-virtual {p1}, Le/f/d/f0/g;->l()Le/f/d/f0/g;

    const/4 v0, 0x0

    .line 21
    :goto_0
    invoke-virtual {p2}, Ljava/util/BitSet;->length()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 22
    invoke-virtual {p2, v0}, Ljava/util/BitSet;->get(I)Z

    move-result v1

    int-to-long v1, v1

    .line 23
    invoke-virtual {p1, v1, v2}, Le/f/d/f0/g;->g(J)Le/f/d/f0/g;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 24
    :cond_1
    invoke-virtual {p1}, Le/f/d/f0/g;->n()Le/f/d/f0/g;

    return-void
.end method
