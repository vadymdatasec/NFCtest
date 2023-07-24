.class public Le/f/c/l/e/m/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/f/c/l/e/m/n0;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:I

.field public final synthetic d:J

.field public final synthetic e:J

.field public final synthetic f:Z

.field public final synthetic g:I

.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:Ljava/lang/String;


# direct methods
.method public constructor <init>(Le/f/c/l/e/m/v0;ILjava/lang/String;IJJZILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput p2, p0, Le/f/c/l/e/m/x;->a:I

    iput-object p3, p0, Le/f/c/l/e/m/x;->b:Ljava/lang/String;

    iput p4, p0, Le/f/c/l/e/m/x;->c:I

    iput-wide p5, p0, Le/f/c/l/e/m/x;->d:J

    iput-wide p7, p0, Le/f/c/l/e/m/x;->e:J

    iput-boolean p9, p0, Le/f/c/l/e/m/x;->f:Z

    iput p10, p0, Le/f/c/l/e/m/x;->g:I

    iput-object p11, p0, Le/f/c/l/e/m/x;->h:Ljava/lang/String;

    iput-object p12, p0, Le/f/c/l/e/m/x;->i:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Le/f/c/l/e/s/e;)V
    .locals 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    iget v1, p0, Le/f/c/l/e/m/x;->a:I

    iget-object v2, p0, Le/f/c/l/e/m/x;->b:Ljava/lang/String;

    iget v3, p0, Le/f/c/l/e/m/x;->c:I

    iget-wide v4, p0, Le/f/c/l/e/m/x;->d:J

    iget-wide v6, p0, Le/f/c/l/e/m/x;->e:J

    iget-boolean v8, p0, Le/f/c/l/e/m/x;->f:Z

    iget v9, p0, Le/f/c/l/e/m/x;->g:I

    iget-object v10, p0, Le/f/c/l/e/m/x;->h:Ljava/lang/String;

    iget-object v11, p0, Le/f/c/l/e/m/x;->i:Ljava/lang/String;

    move-object v0, p1

    invoke-static/range {v0 .. v11}, Le/f/c/l/e/s/f;->a(Le/f/c/l/e/s/e;ILjava/lang/String;IJJZILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method
