.class public Le/f/c/l/e/m/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/f/c/l/e/m/n0;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:J


# direct methods
.method public constructor <init>(Le/f/c/l/e/m/v0;Ljava/lang/String;Ljava/lang/String;J)V
    .locals 0

    .line 1
    iput-object p2, p0, Le/f/c/l/e/m/t;->a:Ljava/lang/String;

    iput-object p3, p0, Le/f/c/l/e/m/t;->b:Ljava/lang/String;

    iput-wide p4, p0, Le/f/c/l/e/m/t;->c:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Le/f/c/l/e/s/e;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le/f/c/l/e/m/t;->a:Ljava/lang/String;

    iget-object v1, p0, Le/f/c/l/e/m/t;->b:Ljava/lang/String;

    iget-wide v2, p0, Le/f/c/l/e/m/t;->c:J

    invoke-static {p1, v0, v1, v2, v3}, Le/f/c/l/e/s/f;->a(Le/f/c/l/e/s/e;Ljava/lang/String;Ljava/lang/String;J)V

    return-void
.end method
