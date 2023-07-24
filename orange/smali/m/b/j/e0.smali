.class public Lm/b/j/e0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:Lm/b/j/e0;

.field public static final d:Lm/b/j/e0;


# instance fields
.field public final a:Z

.field public final b:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lm/b/j/e0;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1}, Lm/b/j/e0;-><init>(ZZ)V

    sput-object v0, Lm/b/j/e0;->c:Lm/b/j/e0;

    .line 2
    new-instance v0, Lm/b/j/e0;

    const/4 v1, 0x1

    invoke-direct {v0, v1, v1}, Lm/b/j/e0;-><init>(ZZ)V

    sput-object v0, Lm/b/j/e0;->d:Lm/b/j/e0;

    return-void
.end method

.method public constructor <init>(ZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-boolean p1, p0, Lm/b/j/e0;->a:Z

    .line 3
    iput-boolean p2, p0, Lm/b/j/e0;->b:Z

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    .line 2
    iget-boolean v0, p0, Lm/b/j/e0;->a:Z

    if-nez v0, :cond_0

    .line 3
    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p1

    :cond_0
    return-object p1
.end method

.method public a(Lm/b/i/b;)Lm/b/i/b;
    .locals 3

    .line 4
    iget-boolean v0, p0, Lm/b/j/e0;->b:Z

    if-nez v0, :cond_0

    .line 5
    invoke-virtual {p1}, Lm/b/i/b;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm/b/i/a;

    .line 6
    invoke-virtual {v1}, Lm/b/i/a;->getKey()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lm/b/i/a;->a(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    return-object p1
.end method
