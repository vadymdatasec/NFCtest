.class public final Lk/e1/i/j;
.super Lk/b1;
.source "SourceFile"


# instance fields
.field public final b:Ljava/lang/String;

.field public final c:J

.field public final d:Ll/h;


# direct methods
.method public constructor <init>(Ljava/lang/String;JLl/h;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lk/b1;-><init>()V

    .line 2
    iput-object p1, p0, Lk/e1/i/j;->b:Ljava/lang/String;

    .line 3
    iput-wide p2, p0, Lk/e1/i/j;->c:J

    .line 4
    iput-object p4, p0, Lk/e1/i/j;->d:Ll/h;

    return-void
.end method


# virtual methods
.method public l()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lk/e1/i/j;->c:J

    return-wide v0
.end method

.method public m()Lk/i0;
    .locals 1

    .line 1
    iget-object v0, p0, Lk/e1/i/j;->b:Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-static {v0}, Lk/i0;->b(Ljava/lang/String;)Lk/i0;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public n()Ll/h;
    .locals 1

    .line 1
    iget-object v0, p0, Lk/e1/i/j;->d:Ll/h;

    return-object v0
.end method
