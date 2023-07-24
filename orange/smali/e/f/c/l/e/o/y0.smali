.class public final Le/f/c/l/e/o/y0;
.super Le/f/c/l/e/o/r2;
.source "SourceFile"


# instance fields
.field public a:Le/f/c/l/e/o/p3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/f/c/l/e/o/p3<",
            "Le/f/c/l/e/o/z2;",
            ">;"
        }
    .end annotation
.end field

.field public b:Le/f/c/l/e/o/t2;

.field public c:Le/f/c/l/e/o/v2;

.field public d:Le/f/c/l/e/o/p3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/f/c/l/e/o/p3<",
            "Le/f/c/l/e/o/q2;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Le/f/c/l/e/o/r2;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Le/f/c/l/e/o/a3;
    .locals 8

    .line 7
    iget-object v0, p0, Le/f/c/l/e/o/y0;->a:Le/f/c/l/e/o/p3;

    const-string v1, ""

    if-nez v0, :cond_0

    .line 8
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " threads"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 9
    :cond_0
    iget-object v0, p0, Le/f/c/l/e/o/y0;->b:Le/f/c/l/e/o/t2;

    if-nez v0, :cond_1

    .line 10
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " exception"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 11
    :cond_1
    iget-object v0, p0, Le/f/c/l/e/o/y0;->c:Le/f/c/l/e/o/v2;

    if-nez v0, :cond_2

    .line 12
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " signal"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 13
    :cond_2
    iget-object v0, p0, Le/f/c/l/e/o/y0;->d:Le/f/c/l/e/o/p3;

    if-nez v0, :cond_3

    .line 14
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " binaries"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 15
    :cond_3
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 16
    new-instance v0, Le/f/c/l/e/o/z0;

    iget-object v3, p0, Le/f/c/l/e/o/y0;->a:Le/f/c/l/e/o/p3;

    iget-object v4, p0, Le/f/c/l/e/o/y0;->b:Le/f/c/l/e/o/t2;

    iget-object v5, p0, Le/f/c/l/e/o/y0;->c:Le/f/c/l/e/o/v2;

    iget-object v6, p0, Le/f/c/l/e/o/y0;->d:Le/f/c/l/e/o/p3;

    const/4 v7, 0x0

    move-object v2, v0

    invoke-direct/range {v2 .. v7}, Le/f/c/l/e/o/z0;-><init>(Le/f/c/l/e/o/p3;Le/f/c/l/e/o/t2;Le/f/c/l/e/o/v2;Le/f/c/l/e/o/p3;Le/f/c/l/e/o/x0;)V

    return-object v0

    .line 17
    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Missing required properties:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public a(Le/f/c/l/e/o/p3;)Le/f/c/l/e/o/r2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/f/c/l/e/o/p3<",
            "Le/f/c/l/e/o/q2;",
            ">;)",
            "Le/f/c/l/e/o/r2;"
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 5
    iput-object p1, p0, Le/f/c/l/e/o/y0;->d:Le/f/c/l/e/o/p3;

    return-object p0

    .line 6
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null binaries"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public a(Le/f/c/l/e/o/t2;)Le/f/c/l/e/o/r2;
    .locals 1

    if-eqz p1, :cond_0

    .line 1
    iput-object p1, p0, Le/f/c/l/e/o/y0;->b:Le/f/c/l/e/o/t2;

    return-object p0

    .line 2
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null exception"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public a(Le/f/c/l/e/o/v2;)Le/f/c/l/e/o/r2;
    .locals 1

    if-eqz p1, :cond_0

    .line 3
    iput-object p1, p0, Le/f/c/l/e/o/y0;->c:Le/f/c/l/e/o/v2;

    return-object p0

    .line 4
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null signal"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public b(Le/f/c/l/e/o/p3;)Le/f/c/l/e/o/r2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/f/c/l/e/o/p3<",
            "Le/f/c/l/e/o/z2;",
            ">;)",
            "Le/f/c/l/e/o/r2;"
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 1
    iput-object p1, p0, Le/f/c/l/e/o/y0;->a:Le/f/c/l/e/o/p3;

    return-object p0

    .line 2
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null threads"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
