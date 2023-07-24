.class public final Le/f/a/a/j/e;
.super Le/f/a/a/j/v;
.source "SourceFile"


# instance fields
.field public a:Le/f/a/a/j/x;

.field public b:Ljava/lang/String;

.field public c:Le/f/a/a/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/f/a/a/c<",
            "*>;"
        }
    .end annotation
.end field

.field public d:Le/f/a/a/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/f/a/a/e<",
            "*[B>;"
        }
    .end annotation
.end field

.field public e:Le/f/a/a/b;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Le/f/a/a/j/v;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Le/f/a/a/b;)Le/f/a/a/j/v;
    .locals 1

    if-eqz p1, :cond_0

    .line 9
    iput-object p1, p0, Le/f/a/a/j/e;->e:Le/f/a/a/b;

    return-object p0

    .line 10
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null encoding"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public a(Le/f/a/a/c;)Le/f/a/a/j/v;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/f/a/a/c<",
            "*>;)",
            "Le/f/a/a/j/v;"
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 5
    iput-object p1, p0, Le/f/a/a/j/e;->c:Le/f/a/a/c;

    return-object p0

    .line 6
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null event"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public a(Le/f/a/a/e;)Le/f/a/a/j/v;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/f/a/a/e<",
            "*[B>;)",
            "Le/f/a/a/j/v;"
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 7
    iput-object p1, p0, Le/f/a/a/j/e;->d:Le/f/a/a/e;

    return-object p0

    .line 8
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null transformer"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public a(Le/f/a/a/j/x;)Le/f/a/a/j/v;
    .locals 1

    if-eqz p1, :cond_0

    .line 1
    iput-object p1, p0, Le/f/a/a/j/e;->a:Le/f/a/a/j/x;

    return-object p0

    .line 2
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null transportContext"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public a(Ljava/lang/String;)Le/f/a/a/j/v;
    .locals 1

    if-eqz p1, :cond_0

    .line 3
    iput-object p1, p0, Le/f/a/a/j/e;->b:Ljava/lang/String;

    return-object p0

    .line 4
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null transportName"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public a()Le/f/a/a/j/w;
    .locals 9

    .line 11
    iget-object v0, p0, Le/f/a/a/j/e;->a:Le/f/a/a/j/x;

    const-string v1, ""

    if-nez v0, :cond_0

    .line 12
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " transportContext"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 13
    :cond_0
    iget-object v0, p0, Le/f/a/a/j/e;->b:Ljava/lang/String;

    if-nez v0, :cond_1

    .line 14
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " transportName"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 15
    :cond_1
    iget-object v0, p0, Le/f/a/a/j/e;->c:Le/f/a/a/c;

    if-nez v0, :cond_2

    .line 16
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " event"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 17
    :cond_2
    iget-object v0, p0, Le/f/a/a/j/e;->d:Le/f/a/a/e;

    if-nez v0, :cond_3

    .line 18
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " transformer"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 19
    :cond_3
    iget-object v0, p0, Le/f/a/a/j/e;->e:Le/f/a/a/b;

    if-nez v0, :cond_4

    .line 20
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " encoding"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 21
    :cond_4
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 22
    new-instance v0, Le/f/a/a/j/f;

    iget-object v3, p0, Le/f/a/a/j/e;->a:Le/f/a/a/j/x;

    iget-object v4, p0, Le/f/a/a/j/e;->b:Ljava/lang/String;

    iget-object v5, p0, Le/f/a/a/j/e;->c:Le/f/a/a/c;

    iget-object v6, p0, Le/f/a/a/j/e;->d:Le/f/a/a/e;

    iget-object v7, p0, Le/f/a/a/j/e;->e:Le/f/a/a/b;

    const/4 v8, 0x0

    move-object v2, v0

    invoke-direct/range {v2 .. v8}, Le/f/a/a/j/f;-><init>(Le/f/a/a/j/x;Ljava/lang/String;Le/f/a/a/c;Le/f/a/a/e;Le/f/a/a/b;Le/f/a/a/j/d;)V

    return-object v0

    .line 23
    :cond_5
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
