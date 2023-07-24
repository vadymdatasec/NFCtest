.class public abstract Le/f/a/b/f/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Le/f/a/b/c/l/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/f/a/b/c/l/f<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public static final b:Le/f/a/b/c/l/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/f/a/b/c/l/f<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public static final c:Le/f/a/b/c/l/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/f/a/b/c/l/a<",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public static final d:Le/f/a/b/c/l/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/f/a/b/c/l/a<",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Le/f/a/b/c/l/f;

    invoke-direct {v0}, Le/f/a/b/c/l/f;-><init>()V

    sput-object v0, Le/f/a/b/f/b;->a:Le/f/a/b/c/l/f;

    .line 2
    new-instance v0, Le/f/a/b/c/l/f;

    invoke-direct {v0}, Le/f/a/b/c/l/f;-><init>()V

    sput-object v0, Le/f/a/b/f/b;->b:Le/f/a/b/c/l/f;

    .line 3
    new-instance v0, Le/f/a/b/f/c;

    invoke-direct {v0}, Le/f/a/b/f/c;-><init>()V

    sput-object v0, Le/f/a/b/f/b;->c:Le/f/a/b/c/l/a;

    .line 4
    new-instance v0, Le/f/a/b/f/d;

    invoke-direct {v0}, Le/f/a/b/f/d;-><init>()V

    sput-object v0, Le/f/a/b/f/b;->d:Le/f/a/b/c/l/a;

    .line 5
    new-instance v0, Lcom/google/android/gms/common/api/Scope;

    const-string v1, "profile"

    invoke-direct {v0, v1}, Lcom/google/android/gms/common/api/Scope;-><init>(Ljava/lang/String;)V

    .line 6
    new-instance v0, Lcom/google/android/gms/common/api/Scope;

    const-string v1, "email"

    invoke-direct {v0, v1}, Lcom/google/android/gms/common/api/Scope;-><init>(Ljava/lang/String;)V

    .line 7
    new-instance v0, Le/f/a/b/c/l/g;

    sget-object v1, Le/f/a/b/f/b;->c:Le/f/a/b/c/l/a;

    sget-object v2, Le/f/a/b/f/b;->a:Le/f/a/b/c/l/f;

    const-string v3, "SignIn.API"

    invoke-direct {v0, v3, v1, v2}, Le/f/a/b/c/l/g;-><init>(Ljava/lang/String;Le/f/a/b/c/l/a;Le/f/a/b/c/l/f;)V

    .line 8
    new-instance v0, Le/f/a/b/c/l/g;

    sget-object v1, Le/f/a/b/f/b;->d:Le/f/a/b/c/l/a;

    sget-object v2, Le/f/a/b/f/b;->b:Le/f/a/b/c/l/f;

    const-string v3, "SignIn.INTERNAL_API"

    invoke-direct {v0, v3, v1, v2}, Le/f/a/b/c/l/g;-><init>(Ljava/lang/String;Le/f/a/b/c/l/a;Le/f/a/b/c/l/f;)V

    return-void
.end method
