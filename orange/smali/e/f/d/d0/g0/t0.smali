.class public final Le/f/d/d0/g0/t0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/f/d/b0;


# instance fields
.field public final synthetic b:Ljava/lang/Class;

.field public final synthetic c:Le/f/d/a0;


# direct methods
.method public constructor <init>(Ljava/lang/Class;Le/f/d/a0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Le/f/d/d0/g0/t0;->b:Ljava/lang/Class;

    iput-object p2, p0, Le/f/d/d0/g0/t0;->c:Le/f/d/a0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Le/f/d/q;Le/f/d/e0/a;)Le/f/d/a0;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Le/f/d/q;",
            "Le/f/d/e0/a<",
            "TT;>;)",
            "Le/f/d/a0<",
            "TT;>;"
        }
    .end annotation

    .line 1
    iget-object p1, p0, Le/f/d/d0/g0/t0;->b:Ljava/lang/Class;

    invoke-virtual {p2}, Le/f/d/e0/a;->a()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Le/f/d/d0/g0/t0;->c:Le/f/d/a0;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Factory[typeHierarchy="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le/f/d/d0/g0/t0;->b:Ljava/lang/Class;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ",adapter="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le/f/d/d0/g0/t0;->c:Le/f/d/a0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
