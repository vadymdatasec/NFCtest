.class public final Le/f/c/l/e/o/v0;
.super Le/f/c/l/e/o/o2;
.source "SourceFile"


# instance fields
.field public a:Le/f/c/l/e/o/a3;

.field public b:Le/f/c/l/e/o/p3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/f/c/l/e/o/p3<",
            "Le/f/c/l/e/o/d2;",
            ">;"
        }
    .end annotation
.end field

.field public c:Ljava/lang/Boolean;

.field public d:Ljava/lang/Integer;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Le/f/c/l/e/o/o2;-><init>()V

    return-void
.end method

.method public constructor <init>(Le/f/c/l/e/o/b3;)V
    .locals 1

    .line 3
    invoke-direct {p0}, Le/f/c/l/e/o/o2;-><init>()V

    .line 4
    invoke-virtual {p1}, Le/f/c/l/e/o/b3;->c()Le/f/c/l/e/o/a3;

    move-result-object v0

    iput-object v0, p0, Le/f/c/l/e/o/v0;->a:Le/f/c/l/e/o/a3;

    .line 5
    invoke-virtual {p1}, Le/f/c/l/e/o/b3;->b()Le/f/c/l/e/o/p3;

    move-result-object v0

    iput-object v0, p0, Le/f/c/l/e/o/v0;->b:Le/f/c/l/e/o/p3;

    .line 6
    invoke-virtual {p1}, Le/f/c/l/e/o/b3;->a()Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Le/f/c/l/e/o/v0;->c:Ljava/lang/Boolean;

    .line 7
    invoke-virtual {p1}, Le/f/c/l/e/o/b3;->d()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Le/f/c/l/e/o/v0;->d:Ljava/lang/Integer;

    return-void
.end method

.method public synthetic constructor <init>(Le/f/c/l/e/o/b3;Le/f/c/l/e/o/u0;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Le/f/c/l/e/o/v0;-><init>(Le/f/c/l/e/o/b3;)V

    return-void
.end method


# virtual methods
.method public a()Le/f/c/l/e/o/b3;
    .locals 8

    .line 6
    iget-object v0, p0, Le/f/c/l/e/o/v0;->a:Le/f/c/l/e/o/a3;

    const-string v1, ""

    if-nez v0, :cond_0

    .line 7
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " execution"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 8
    :cond_0
    iget-object v0, p0, Le/f/c/l/e/o/v0;->d:Ljava/lang/Integer;

    if-nez v0, :cond_1

    .line 9
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " uiOrientation"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 10
    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 11
    new-instance v0, Le/f/c/l/e/o/w0;

    iget-object v3, p0, Le/f/c/l/e/o/v0;->a:Le/f/c/l/e/o/a3;

    iget-object v4, p0, Le/f/c/l/e/o/v0;->b:Le/f/c/l/e/o/p3;

    iget-object v5, p0, Le/f/c/l/e/o/v0;->c:Ljava/lang/Boolean;

    iget-object v1, p0, Le/f/c/l/e/o/v0;->d:Ljava/lang/Integer;

    .line 12
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v6

    const/4 v7, 0x0

    move-object v2, v0

    invoke-direct/range {v2 .. v7}, Le/f/c/l/e/o/w0;-><init>(Le/f/c/l/e/o/a3;Le/f/c/l/e/o/p3;Ljava/lang/Boolean;ILe/f/c/l/e/o/u0;)V

    return-object v0

    .line 13
    :cond_2
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

.method public a(I)Le/f/c/l/e/o/o2;
    .locals 0

    .line 5
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Le/f/c/l/e/o/v0;->d:Ljava/lang/Integer;

    return-object p0
.end method

.method public a(Le/f/c/l/e/o/a3;)Le/f/c/l/e/o/o2;
    .locals 1

    if-eqz p1, :cond_0

    .line 1
    iput-object p1, p0, Le/f/c/l/e/o/v0;->a:Le/f/c/l/e/o/a3;

    return-object p0

    .line 2
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null execution"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public a(Le/f/c/l/e/o/p3;)Le/f/c/l/e/o/o2;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/f/c/l/e/o/p3<",
            "Le/f/c/l/e/o/d2;",
            ">;)",
            "Le/f/c/l/e/o/o2;"
        }
    .end annotation

    .line 3
    iput-object p1, p0, Le/f/c/l/e/o/v0;->b:Le/f/c/l/e/o/p3;

    return-object p0
.end method

.method public a(Ljava/lang/Boolean;)Le/f/c/l/e/o/o2;
    .locals 0

    .line 4
    iput-object p1, p0, Le/f/c/l/e/o/v0;->c:Ljava/lang/Boolean;

    return-object p0
.end method
