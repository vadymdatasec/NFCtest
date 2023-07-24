.class public final Le/f/e/r/l;
.super Le/f/e/r/p;
.source "SourceFile"


# instance fields
.field public final h:Le/f/e/r/p;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Le/f/e/r/p;-><init>()V

    .line 2
    new-instance v0, Le/f/e/r/e;

    invoke-direct {v0}, Le/f/e/r/e;-><init>()V

    iput-object v0, p0, Le/f/e/r/l;->h:Le/f/e/r/p;

    return-void
.end method

.method public static a(Le/f/e/j;)Le/f/e/j;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/zxing/FormatException;
        }
    .end annotation

    .line 5
    invoke-virtual {p0}, Le/f/e/j;->e()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    .line 6
    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v2, 0x30

    if-ne v1, v2, :cond_0

    .line 7
    new-instance v1, Le/f/e/j;

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0}, Le/f/e/j;->d()[Le/f/e/l;

    move-result-object p0

    sget-object v3, Le/f/e/a;->p:Le/f/e/a;

    invoke-direct {v1, v0, v2, p0, v3}, Le/f/e/j;-><init>(Ljava/lang/String;[B[Le/f/e/l;Le/f/e/a;)V

    return-object v1

    .line 8
    :cond_0
    invoke-static {}, Lcom/google/zxing/FormatException;->a()Lcom/google/zxing/FormatException;

    move-result-object p0

    throw p0
.end method


# virtual methods
.method public a(Le/f/e/o/a;[ILjava/lang/StringBuilder;)I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/zxing/NotFoundException;
        }
    .end annotation

    .line 4
    iget-object v0, p0, Le/f/e/r/l;->h:Le/f/e/r/p;

    invoke-virtual {v0, p1, p2, p3}, Le/f/e/r/p;->a(Le/f/e/o/a;[ILjava/lang/StringBuilder;)I

    move-result p1

    return p1
.end method

.method public a(ILe/f/e/o/a;Ljava/util/Map;)Le/f/e/j;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Le/f/e/o/a;",
            "Ljava/util/Map<",
            "Le/f/e/d;",
            "*>;)",
            "Le/f/e/j;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/zxing/NotFoundException;,
            Lcom/google/zxing/FormatException;,
            Lcom/google/zxing/ChecksumException;
        }
    .end annotation

    .line 2
    iget-object v0, p0, Le/f/e/r/l;->h:Le/f/e/r/p;

    invoke-virtual {v0, p1, p2, p3}, Le/f/e/r/p;->a(ILe/f/e/o/a;Ljava/util/Map;)Le/f/e/j;

    move-result-object p1

    invoke-static {p1}, Le/f/e/r/l;->a(Le/f/e/j;)Le/f/e/j;

    move-result-object p1

    return-object p1
.end method

.method public a(ILe/f/e/o/a;[ILjava/util/Map;)Le/f/e/j;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Le/f/e/o/a;",
            "[I",
            "Ljava/util/Map<",
            "Le/f/e/d;",
            "*>;)",
            "Le/f/e/j;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/zxing/NotFoundException;,
            Lcom/google/zxing/FormatException;,
            Lcom/google/zxing/ChecksumException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le/f/e/r/l;->h:Le/f/e/r/p;

    invoke-virtual {v0, p1, p2, p3, p4}, Le/f/e/r/p;->a(ILe/f/e/o/a;[ILjava/util/Map;)Le/f/e/j;

    move-result-object p1

    invoke-static {p1}, Le/f/e/r/l;->a(Le/f/e/j;)Le/f/e/j;

    move-result-object p1

    return-object p1
.end method

.method public a(Le/f/e/c;Ljava/util/Map;)Le/f/e/j;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/f/e/c;",
            "Ljava/util/Map<",
            "Le/f/e/d;",
            "*>;)",
            "Le/f/e/j;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/zxing/NotFoundException;,
            Lcom/google/zxing/FormatException;
        }
    .end annotation

    .line 3
    iget-object v0, p0, Le/f/e/r/l;->h:Le/f/e/r/p;

    invoke-virtual {v0, p1, p2}, Le/f/e/r/k;->a(Le/f/e/c;Ljava/util/Map;)Le/f/e/j;

    move-result-object p1

    invoke-static {p1}, Le/f/e/r/l;->a(Le/f/e/j;)Le/f/e/j;

    move-result-object p1

    return-object p1
.end method

.method public b()Le/f/e/a;
    .locals 1

    .line 1
    sget-object v0, Le/f/e/a;->p:Le/f/e/a;

    return-object v0
.end method
