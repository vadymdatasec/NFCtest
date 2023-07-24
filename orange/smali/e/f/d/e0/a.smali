.class public Le/f/d/e0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "-TT;>;"
        }
    .end annotation
.end field

.field public final b:Ljava/lang/reflect/Type;

.field public final c:I


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Type;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-static {p1}, Le/f/d/d0/a;->a(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p1, Ljava/lang/reflect/Type;

    invoke-static {p1}, Le/f/d/d0/e;->c(Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    move-result-object p1

    iput-object p1, p0, Le/f/d/e0/a;->b:Ljava/lang/reflect/Type;

    .line 3
    invoke-static {p1}, Le/f/d/d0/e;->f(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object p1

    iput-object p1, p0, Le/f/d/e0/a;->a:Ljava/lang/Class;

    .line 4
    iget-object p1, p0, Le/f/d/e0/a;->b:Ljava/lang/reflect/Type;

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result p1

    iput p1, p0, Le/f/d/e0/a;->c:I

    return-void
.end method

.method public static a(Ljava/lang/Class;)Le/f/d/e0/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)",
            "Le/f/d/e0/a<",
            "TT;>;"
        }
    .end annotation

    .line 3
    new-instance v0, Le/f/d/e0/a;

    invoke-direct {v0, p0}, Le/f/d/e0/a;-><init>(Ljava/lang/reflect/Type;)V

    return-object v0
.end method

.method public static a(Ljava/lang/reflect/Type;)Le/f/d/e0/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Type;",
            ")",
            "Le/f/d/e0/a<",
            "*>;"
        }
    .end annotation

    .line 2
    new-instance v0, Le/f/d/e0/a;

    invoke-direct {v0, p0}, Le/f/d/e0/a;-><init>(Ljava/lang/reflect/Type;)V

    return-object v0
.end method


# virtual methods
.method public final a()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "-TT;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le/f/d/e0/a;->a:Ljava/lang/Class;

    return-object v0
.end method

.method public final b()Ljava/lang/reflect/Type;
    .locals 1

    .line 1
    iget-object v0, p0, Le/f/d/e0/a;->b:Ljava/lang/reflect/Type;

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Le/f/d/e0/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Le/f/d/e0/a;->b:Ljava/lang/reflect/Type;

    check-cast p1, Le/f/d/e0/a;

    iget-object p1, p1, Le/f/d/e0/a;->b:Ljava/lang/reflect/Type;

    invoke-static {v0, p1}, Le/f/d/d0/e;->a(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget v0, p0, Le/f/d/e0/a;->c:I

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Le/f/d/e0/a;->b:Ljava/lang/reflect/Type;

    invoke-static {v0}, Le/f/d/d0/e;->i(Ljava/lang/reflect/Type;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
