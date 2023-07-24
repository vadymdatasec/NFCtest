.class public Le/d/a/a/e/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Le/d/a/a/e/a;->d:Landroid/content/Context;

    .line 3
    iput-object p2, p0, Le/d/a/a/e/a;->a:Ljava/lang/String;

    .line 4
    iput-object p3, p0, Le/d/a/a/e/a;->b:Ljava/lang/String;

    .line 5
    iput-object p4, p0, Le/d/a/a/e/a;->c:Ljava/lang/String;

    return-void
.end method

.method public static a(Ljava/security/cert/X509Certificate;)Ljava/lang/String;
    .locals 2

    .line 1
    :try_start_0
    invoke-virtual {p0}, Ljava/security/cert/X509Certificate;->getEncoded()[B

    move-result-object p0
    :try_end_0
    .catch Ljava/security/cert/CertificateEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "-----BEGIN CERTIFICATE-----\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v1, 0x0

    invoke-static {p0, v1}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "-----END CERTIFICATE-----\n"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 4
    :catch_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "Should never happen - certificate was previously parsed by the system"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public a(Le/d/a/a/e/c;)V
    .locals 2

    .line 26
    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.datatheorem.android.trustkit.reporting.BackgroundReporter:REPORT_VALIDATION_EVENT"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v1, "Report"

    .line 27
    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 28
    iget-object p1, p0, Le/d/a/a/e/a;->d:Landroid/content/Context;

    invoke-static {p1}, Lc/p/a/d;->a(Landroid/content/Context;)Lc/p/a/d;

    move-result-object p1

    invoke-virtual {p1, v0}, Lc/p/a/d;->a(Landroid/content/Intent;)Z

    return-void
.end method

.method public a(Le/d/a/a/e/c;Ljava/util/Set;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/d/a/a/e/c;",
            "Ljava/util/Set<",
            "Ljava/net/URL;",
            ">;)V"
        }
    .end annotation

    .line 22
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 23
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 24
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 25
    new-instance p1, Le/d/a/a/e/b;

    invoke-direct {p1}, Le/d/a/a/e/b;-><init>()V

    invoke-virtual {v0}, Ljava/util/ArrayList;->toArray()[Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Le/d/a/a/c/b;Le/d/a/a/d/e;)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            "Ljava/util/List<",
            "Ljava/security/cert/X509Certificate;",
            ">;",
            "Ljava/util/List<",
            "Ljava/security/cert/X509Certificate;",
            ">;",
            "Le/d/a/a/c/b;",
            "Le/d/a/a/d/e;",
            ")V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v15, p1

    .line 5
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Generating pin failure report for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Le/d/a/a/f/a;->a(Ljava/lang/String;)V

    .line 6
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 7
    invoke-interface/range {p4 .. p4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/security/cert/X509Certificate;

    .line 8
    invoke-static {v2}, Le/d/a/a/e/a;->a(Ljava/security/cert/X509Certificate;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v11, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 9
    :cond_0
    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 10
    invoke-interface/range {p3 .. p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/security/cert/X509Certificate;

    .line 11
    invoke-static {v2}, Le/d/a/a/e/a;->a(Ljava/security/cert/X509Certificate;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v10, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 12
    :cond_1
    new-instance v14, Le/d/a/a/e/c;

    iget-object v2, v0, Le/d/a/a/e/a;->a:Ljava/lang/String;

    iget-object v3, v0, Le/d/a/a/e/a;->b:Ljava/lang/String;

    iget-object v4, v0, Le/d/a/a/e/a;->c:Ljava/lang/String;

    .line 13
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    .line 14
    invoke-virtual/range {p5 .. p5}, Le/d/a/a/c/b;->b()Ljava/lang/String;

    move-result-object v7

    invoke-virtual/range {p5 .. p5}, Le/d/a/a/c/b;->f()Z

    move-result v8

    .line 15
    invoke-virtual/range {p5 .. p5}, Le/d/a/a/c/b;->e()Z

    move-result v9

    new-instance v12, Ljava/sql/Date;

    .line 16
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-direct {v12, v0, v1}, Ljava/sql/Date;-><init>(J)V

    .line 17
    invoke-virtual/range {p5 .. p5}, Le/d/a/a/c/b;->c()Ljava/util/Set;

    move-result-object v13

    move-object v1, v14

    move-object/from16 v5, p1

    move-object v0, v14

    move-object/from16 v14, p6

    invoke-direct/range {v1 .. v14}, Le/d/a/a/e/c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ZZLjava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Set;Le/d/a/a/d/e;)V

    .line 18
    invoke-static {v0}, Le/d/a/a/e/d;->a(Le/d/a/a/e/c;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 19
    invoke-virtual/range {p5 .. p5}, Le/d/a/a/c/b;->d()Ljava/util/Set;

    move-result-object v1

    move-object/from16 v2, p0

    invoke-virtual {v2, v0, v1}, Le/d/a/a/e/a;->a(Le/d/a/a/e/c;Ljava/util/Set;)V

    .line 20
    invoke-virtual {v2, v0}, Le/d/a/a/e/a;->a(Le/d/a/a/e/c;)V

    goto :goto_2

    :cond_2
    move-object/from16 v2, p0

    .line 21
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Report for "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " was not sent due to rate-limiting"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Le/d/a/a/f/a;->a(Ljava/lang/String;)V

    :goto_2
    return-void
.end method
