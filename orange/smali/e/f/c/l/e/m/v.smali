.class public Le/f/c/l/e/m/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/f/c/l/e/m/n0;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Z


# direct methods
.method public constructor <init>(Le/f/c/l/e/m/v0;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    .line 1
    iput-object p2, p0, Le/f/c/l/e/m/v;->a:Ljava/lang/String;

    iput-object p3, p0, Le/f/c/l/e/m/v;->b:Ljava/lang/String;

    iput-boolean p4, p0, Le/f/c/l/e/m/v;->c:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Le/f/c/l/e/s/e;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le/f/c/l/e/m/v;->a:Ljava/lang/String;

    iget-object v1, p0, Le/f/c/l/e/m/v;->b:Ljava/lang/String;

    iget-boolean v2, p0, Le/f/c/l/e/m/v;->c:Z

    invoke-static {p1, v0, v1, v2}, Le/f/c/l/e/s/f;->a(Le/f/c/l/e/s/e;Ljava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method
