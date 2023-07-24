.class public Lk/e1/k/k;
.super Lk/e1/b;
.source "SourceFile"


# instance fields
.field public final synthetic c:I

.field public final synthetic d:J

.field public final synthetic e:Lk/e1/k/x;


# direct methods
.method public varargs constructor <init>(Lk/e1/k/x;Ljava/lang/String;[Ljava/lang/Object;IJ)V
    .locals 0

    .line 1
    iput-object p1, p0, Lk/e1/k/k;->e:Lk/e1/k/x;

    iput p4, p0, Lk/e1/k/k;->c:I

    iput-wide p5, p0, Lk/e1/k/k;->d:J

    invoke-direct {p0, p2, p3}, Lk/e1/b;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public b()V
    .locals 4

    .line 1
    :try_start_0
    iget-object v0, p0, Lk/e1/k/k;->e:Lk/e1/k/x;

    iget-object v0, v0, Lk/e1/k/x;->s:Lk/e1/k/f0;

    iget v1, p0, Lk/e1/k/k;->c:I

    iget-wide v2, p0, Lk/e1/k/k;->d:J

    invoke-virtual {v0, v1, v2, v3}, Lk/e1/k/f0;->a(IJ)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 2
    :catch_0
    iget-object v0, p0, Lk/e1/k/k;->e:Lk/e1/k/x;

    invoke-static {v0}, Lk/e1/k/x;->a(Lk/e1/k/x;)V

    :goto_0
    return-void
.end method
