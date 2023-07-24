.class public final Lm/b/j/i0;
.super Lm/b/j/q0;
.source "SourceFile"


# instance fields
.field public b:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Lm/b/j/q0;-><init>(Lm/b/j/h0;)V

    .line 2
    sget-object v0, Lm/b/j/p0;->f:Lm/b/j/p0;

    iput-object v0, p0, Lm/b/j/q0;->a:Lm/b/j/p0;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Lm/b/j/i0;
    .locals 0

    .line 1
    iput-object p1, p0, Lm/b/j/i0;->b:Ljava/lang/String;

    return-object p0
.end method

.method public l()Lm/b/j/q0;
    .locals 1

    const/4 v0, 0x0

    .line 1
    iput-object v0, p0, Lm/b/j/i0;->b:Ljava/lang/String;

    return-object p0
.end method

.method public n()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lm/b/j/i0;->b:Ljava/lang/String;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lm/b/j/i0;->n()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
