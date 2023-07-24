.class public final Le/f/c/n/h/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/f/c/n/g/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Le/f/c/n/g/b<",
        "Le/f/c/n/h/f;",
        ">;"
    }
.end annotation


# static fields
.field public static final e:Le/f/c/n/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/f/c/n/c<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public static final f:Le/f/c/n/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/f/c/n/e<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final g:Le/f/c/n/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/f/c/n/e<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static final h:Le/f/c/n/h/e;


# instance fields
.field public final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Le/f/c/n/c<",
            "*>;>;"
        }
    .end annotation
.end field

.field public final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Le/f/c/n/e<",
            "*>;>;"
        }
    .end annotation
.end field

.field public c:Le/f/c/n/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/f/c/n/c<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public d:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 1
    invoke-static {}, Le/f/c/n/h/a;->a()Le/f/c/n/c;

    move-result-object v0

    sput-object v0, Le/f/c/n/h/f;->e:Le/f/c/n/c;

    .line 2
    invoke-static {}, Le/f/c/n/h/b;->a()Le/f/c/n/e;

    move-result-object v0

    sput-object v0, Le/f/c/n/h/f;->f:Le/f/c/n/e;

    .line 3
    invoke-static {}, Le/f/c/n/h/c;->a()Le/f/c/n/e;

    move-result-object v0

    sput-object v0, Le/f/c/n/h/f;->g:Le/f/c/n/e;

    .line 4
    new-instance v0, Le/f/c/n/h/e;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Le/f/c/n/h/e;-><init>(Le/f/c/n/h/d;)V

    sput-object v0, Le/f/c/n/h/f;->h:Le/f/c/n/h/e;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Le/f/c/n/h/f;->a:Ljava/util/Map;

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Le/f/c/n/h/f;->b:Ljava/util/Map;

    .line 4
    sget-object v0, Le/f/c/n/h/f;->e:Le/f/c/n/c;

    iput-object v0, p0, Le/f/c/n/h/f;->c:Le/f/c/n/c;

    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Le/f/c/n/h/f;->d:Z

    .line 6
    const-class v0, Ljava/lang/String;

    sget-object v1, Le/f/c/n/h/f;->f:Le/f/c/n/e;

    invoke-virtual {p0, v0, v1}, Le/f/c/n/h/f;->a(Ljava/lang/Class;Le/f/c/n/e;)Le/f/c/n/h/f;

    .line 7
    const-class v0, Ljava/lang/Boolean;

    sget-object v1, Le/f/c/n/h/f;->g:Le/f/c/n/e;

    invoke-virtual {p0, v0, v1}, Le/f/c/n/h/f;->a(Ljava/lang/Class;Le/f/c/n/e;)Le/f/c/n/h/f;

    .line 8
    const-class v0, Ljava/util/Date;

    sget-object v1, Le/f/c/n/h/f;->h:Le/f/c/n/h/e;

    invoke-virtual {p0, v0, v1}, Le/f/c/n/h/f;->a(Ljava/lang/Class;Le/f/c/n/e;)Le/f/c/n/h/f;

    return-void
.end method

.method public static synthetic a(Le/f/c/n/h/f;)Ljava/util/Map;
    .locals 0

    .line 1
    iget-object p0, p0, Le/f/c/n/h/f;->a:Ljava/util/Map;

    return-object p0
.end method

.method public static synthetic a(Ljava/lang/Boolean;Le/f/c/n/f;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 6
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    invoke-interface {p1, p0}, Le/f/c/n/f;->a(Z)Le/f/c/n/f;

    return-void
.end method

.method public static synthetic a(Ljava/lang/Object;Le/f/c/n/d;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 3
    new-instance p1, Lcom/google/firebase/encoders/EncodingException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Couldn\'t find encoder for type "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 4
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Lcom/google/firebase/encoders/EncodingException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static synthetic a(Ljava/lang/String;Le/f/c/n/f;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 5
    invoke-interface {p1, p0}, Le/f/c/n/f;->a(Ljava/lang/String;)Le/f/c/n/f;

    return-void
.end method

.method public static synthetic b(Le/f/c/n/h/f;)Ljava/util/Map;
    .locals 0

    .line 1
    iget-object p0, p0, Le/f/c/n/h/f;->b:Ljava/util/Map;

    return-object p0
.end method

.method public static synthetic c(Le/f/c/n/h/f;)Le/f/c/n/c;
    .locals 0

    .line 1
    iget-object p0, p0, Le/f/c/n/h/f;->c:Le/f/c/n/c;

    return-object p0
.end method

.method public static synthetic d(Le/f/c/n/h/f;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Le/f/c/n/h/f;->d:Z

    return p0
.end method


# virtual methods
.method public a()Le/f/c/n/a;
    .locals 1

    .line 13
    new-instance v0, Le/f/c/n/h/d;

    invoke-direct {v0, p0}, Le/f/c/n/h/d;-><init>(Le/f/c/n/h/f;)V

    return-object v0
.end method

.method public bridge synthetic a(Ljava/lang/Class;Le/f/c/n/c;)Le/f/c/n/g/b;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Le/f/c/n/h/f;->a(Ljava/lang/Class;Le/f/c/n/c;)Le/f/c/n/h/f;

    return-object p0
.end method

.method public a(Le/f/c/n/g/a;)Le/f/c/n/h/f;
    .locals 0

    .line 11
    invoke-interface {p1, p0}, Le/f/c/n/g/a;->a(Le/f/c/n/g/b;)V

    return-object p0
.end method

.method public a(Ljava/lang/Class;Le/f/c/n/c;)Le/f/c/n/h/f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Le/f/c/n/c<",
            "-TT;>;)",
            "Le/f/c/n/h/f;"
        }
    .end annotation

    .line 7
    iget-object v0, p0, Le/f/c/n/h/f;->a:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    iget-object p2, p0, Le/f/c/n/h/f;->b:Ljava/util/Map;

    invoke-interface {p2, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public a(Ljava/lang/Class;Le/f/c/n/e;)Le/f/c/n/h/f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Le/f/c/n/e<",
            "-TT;>;)",
            "Le/f/c/n/h/f;"
        }
    .end annotation

    .line 9
    iget-object v0, p0, Le/f/c/n/h/f;->b:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    iget-object p2, p0, Le/f/c/n/h/f;->a:Ljava/util/Map;

    invoke-interface {p2, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public a(Z)Le/f/c/n/h/f;
    .locals 0

    .line 12
    iput-boolean p1, p0, Le/f/c/n/h/f;->d:Z

    return-object p0
.end method
