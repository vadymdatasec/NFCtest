.class public final Le/f/c/l/e/o/e1;
.super Le/f/c/l/e/o/s2;
.source "SourceFile"


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ljava/lang/String;

.field public c:Le/f/c/l/e/o/p3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/f/c/l/e/o/p3<",
            "Le/f/c/l/e/o/y2;",
            ">;"
        }
    .end annotation
.end field

.field public d:Le/f/c/l/e/o/t2;

.field public e:Ljava/lang/Integer;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Le/f/c/l/e/o/s2;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)Le/f/c/l/e/o/s2;
    .locals 0

    .line 5
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Le/f/c/l/e/o/e1;->e:Ljava/lang/Integer;

    return-object p0
.end method

.method public a(Le/f/c/l/e/o/p3;)Le/f/c/l/e/o/s2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/f/c/l/e/o/p3<",
            "Le/f/c/l/e/o/y2;",
            ">;)",
            "Le/f/c/l/e/o/s2;"
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 2
    iput-object p1, p0, Le/f/c/l/e/o/e1;->c:Le/f/c/l/e/o/p3;

    return-object p0

    .line 3
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null frames"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public a(Le/f/c/l/e/o/t2;)Le/f/c/l/e/o/s2;
    .locals 0

    .line 4
    iput-object p1, p0, Le/f/c/l/e/o/e1;->d:Le/f/c/l/e/o/t2;

    return-object p0
.end method

.method public a(Ljava/lang/String;)Le/f/c/l/e/o/s2;
    .locals 0

    .line 1
    iput-object p1, p0, Le/f/c/l/e/o/e1;->b:Ljava/lang/String;

    return-object p0
.end method

.method public a()Le/f/c/l/e/o/t2;
    .locals 9

    .line 6
    iget-object v0, p0, Le/f/c/l/e/o/e1;->a:Ljava/lang/String;

    const-string v1, ""

    if-nez v0, :cond_0

    .line 7
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " type"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 8
    :cond_0
    iget-object v0, p0, Le/f/c/l/e/o/e1;->c:Le/f/c/l/e/o/p3;

    if-nez v0, :cond_1

    .line 9
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " frames"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 10
    :cond_1
    iget-object v0, p0, Le/f/c/l/e/o/e1;->e:Ljava/lang/Integer;

    if-nez v0, :cond_2

    .line 11
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " overflowCount"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 12
    :cond_2
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 13
    new-instance v0, Le/f/c/l/e/o/f1;

    iget-object v3, p0, Le/f/c/l/e/o/e1;->a:Ljava/lang/String;

    iget-object v4, p0, Le/f/c/l/e/o/e1;->b:Ljava/lang/String;

    iget-object v5, p0, Le/f/c/l/e/o/e1;->c:Le/f/c/l/e/o/p3;

    iget-object v6, p0, Le/f/c/l/e/o/e1;->d:Le/f/c/l/e/o/t2;

    iget-object v1, p0, Le/f/c/l/e/o/e1;->e:Ljava/lang/Integer;

    .line 14
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v7

    const/4 v8, 0x0

    move-object v2, v0

    invoke-direct/range {v2 .. v8}, Le/f/c/l/e/o/f1;-><init>(Ljava/lang/String;Ljava/lang/String;Le/f/c/l/e/o/p3;Le/f/c/l/e/o/t2;ILe/f/c/l/e/o/d1;)V

    return-object v0

    .line 15
    :cond_3
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

.method public b(Ljava/lang/String;)Le/f/c/l/e/o/s2;
    .locals 1

    if-eqz p1, :cond_0

    .line 1
    iput-object p1, p0, Le/f/c/l/e/o/e1;->a:Ljava/lang/String;

    return-object p0

    .line 2
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null type"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
